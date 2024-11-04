#!/bin/bash


if [ $USER != "root" ]; then
	echo "Must have root permissions"
	exit 1
fi


echo "Checking for public keys..."

if test -f /home/pi/.ssh/authorized_keys; then
	echo "Public keys found"
else 
	echo "No private keys found"
fi

echo "Checking for private keys..."

if ! [ -f /home/pi/.ssh/id_rsa ]; then 
	echo "No private keys found"
else 
	echo "Private keys found"
fi

exit 1
