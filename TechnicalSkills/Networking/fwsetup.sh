#!/bin/bash
if [ ${USER} != "root" ]; then
	echo "Must have root permissions"
else
	echo "Setting up basic firewall..."
	ufw disable
	ufw default deny incoming
	ufw default allow outgoing
	ufw allow ssh
	ufw allow https
	ufw allow 80
	echo "Would you like to block a specific IP? (y/n)"
	read response
	until [ $response = "y" ] || [ $response = "n" ]; do
		echo "Please enter a vaild response"
		read response
	done
	if [ $response = "y" ]; then
		echo "What IP would you like to block?"
		read IP
		echo "Denying IP..."
		ufw insert 1 deny from $IP	
		echo "Enabling Firewall..."
		ufw enable
		ufw reload
		echo "Now exiting..."	
		exit
	else
		echo "Enabling Firewall..."
		ufw enable 
		ufw reload
		echo "Now exiting..."
		exit
	fi
fi
