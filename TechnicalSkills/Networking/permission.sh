#!/bin/bash

echo "Welcome! Let's do a permissions check."

echo "First, choose a directory"
read direct

echo "Now listing files and directories within that path..."

if [ $USER = "root" ]; then
	cd ~
	cd ..
	cd home
	cd pi
	cd $direct
	ls -la
else
	cd ~
	cd $direct
	ls -la
fi

echo "Would you like to change any permissions?"
read response

until [ "$response" = "yes" ] || [ "$response" = "y" ] || [ "$response" = "no" ] || [ "$response" = "n" ]; do
	echo "please choose yes or no"
	read response

done

case $response in
	"yes" | "y") 	
		echo "Please be aware that to continue you must have run this file as sudo."
		echo "Which file's permissions do you want to edit?"
		read file

		echo "What permissions would you like to give owner?"
		echo "1 - Excutable Permissions  2 - Writable Permissions  3 - Executable & Writable  4 - Reading Permissions  5 - Reading & Executable 6 - Reading & Writing  7 - All permissions"
		read one
		until [ "$one" = "1" ] || [ "$one" = "2" ] || [ "$one" = "3" ] || [ "$one" = "4" ] || [ "$one" = "5" ] || [ "$one" = "6" ] || [ "$one" = "7" ]; do
			echo "Please enter a valid choice"
		 	read one

		done
	
		echo "What permissions would you like to give groups?"	
		echo "1 - Excutable Permissions  2 - Writable Permissions  3 - Executable & Writable  4 - Reading Permissions  5 - Reading & Executable 6 - Reading & Writing  7 - All permissions"
		read two
		until [ "$two" = "1" ] || [ "$two" = "2" ] || [ "$two" = "3" ] || [ "$two" = "4" ] || [ "$two" = "5" ] || [ "$two" = "6" ] || [ "$two" = "7" ]; do
			echo "Please enter a valid choice"
			read two
		done

		echo "What permissions would you like to give others?"
		echo "1 - Excutable Permissions  2 - Writable Permissions  3 - Executable & Writable  4 - Reading Permissions  5 - Reading & Executable 6 - Reading & Writing  7 - All permissions"
		read three
		until [ "$two" = "1" ] || [ "$two" = "2" ] || [ "$two" = "3" ] || [ "$two" = "4" ] || [ "$two" = "5" ] || [ "$two" = "6" ] || [ "$two" = "7" ]; do
			echo "Please enter a valid choice"
			read three		
		done
		echo "Adding Permissions..."
		chmod $one$two$three $file

		echo "Finished... now exiting"
		exit
	
		;;

	"no" | "n")
		echo "Now exiting"
		exit 
		;;
esac
