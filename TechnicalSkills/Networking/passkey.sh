#!/bin/bash

echo "Enter the name of a website: "
read WebName

echo "Creating username and password... "

user=$(cat /dev/urandom | tr -dc 'a-zA-Z0-9' | fold -w 8 | head -n 1)
pass=$(cat /dev/urandom | tr -dc 'a-zA-Z0-9' | fold -w 12 |head -n 1)

echo "Website: $WebName, Username: $user, Password: $pass"
echo "Website: $WebName, Username: $user, Password: $pass" >> PassMan.txt
chmod 600 PassMan.txt
