#!/bin/bash
#

echo "What is your name?"
read name
echo "Hello, $name"
echo "You're logged in as $USER"
time=$(date +"%I:%M:%S %p on %b %d, %Y")
echo "It is currently $time... Now running Autoupdate Script"

apt update #grabs the update
apt upgrade -y #applies the update
apt autoremove -y  #removes any unneeded packages
apt autoclean

echo "Finished Autoupdate at $time"
echo "1 - Reboot" 
echo "2 - Shut Down"
echo "3 - Exit"
read response
until [ "$response" = "1" ] || [ "$response" = "2" ] || [ "$response" = "3" ]; do
	echo "invalid choice"
	read response

done

case $response in
	1)
		shutdown -r ;;
	2)
		shutdown ;;
	3)
		echo "What is the code?"
		read code
		until [ $code -eq "1" ]; do
			echo "Incorrect code; try again"
			read code
		done
		exit ;;
esac
