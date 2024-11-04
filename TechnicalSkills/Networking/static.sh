#!/bin/bash

echo "Please choose an IPv4 address 192.168.1.2-245"
read address
echo "Please wait while it loads..."
usable=`ping -c5 192.168.1.$address | awk '{ print $4, $5 }' | sed -n "2p" | awk '{ print $1 }' `

# ping adress entered, print column 4 and 5, print out 2 row, then print first coumn of that result
echo $usable
#pulling the ssid name
myssid=$(iwgetid -r)

#if ip doesnt exist
if [ $usable="Destination" ] ; then
	echo "192.168.1.$address is not in use"
	echo "Would you like to use this IP address? (Y/N)"
	read answer  

	until [ "$answer" = "Y" ] || [ "$answer" = "N" ] || [ "$answer" = "y" ] || ["$answer" = "n" ] ; do
		echo "Invalid choice.. Try again"
		read answer
	done 

	case $answer in
		Y|y) echo "Changing IP now... "
			nmcli con mod $myssid ipv4.addresses 192.168.1.$address/24 
			nmcli con mod $myssid ipv4.gateway 192.168.1.$address
			nmcli con mod $myssid ipv4.dns "192.168.1.$address"
			nmcli con mod $myssid ipv4.method manual
			nmcli con up $myssid
			echo "IP changed... exiting now"
			exit 1
			;; 

		N|n) echo "Exiting now..."
			exit 1
			;;
		esac
else
	echo "192.168.1.$address is in use"
	echo "Exiting now... "
	exit 1
fi
