#!/bin/bash
echo "Where would you like your backups?"
read location

echo "What file do you want to backup?"
read response
zip $response.zip $response

echo "Would you like to add another file to the backup? (y/n)"
read answer
until [ $answer = "y" ] || [ $answer = "n" ]; do
	echo "Please enter valid response"
	read answer
done

if [ $answer = "y" ]; then
	echo "What file would you like to backup?"
	read response2
	zip  $response2.zip $response2
	mv $response.zip ~
	mv $response.zip $location
	mv $response2.zip ~
	mv $response2.zip $location
	

	exit
else
	mv $response.zip ~
	mv $response.zip $location

	exit
fi
