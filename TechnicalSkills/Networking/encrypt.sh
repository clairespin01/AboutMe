#!/bin/bash

#Encrypt Function

encrypt() {
# $1 = argument from input file
# $2 = argument from outfile
# $3 = argurment for password
	local input_file="$1"
	local output_file="$2"
	local password="$3"
# Openssl is cryptokit that allows for different cryptography standards, implementing Secure Sockets Layer
#  aes-256-cbc: Advanced Encryption Standard using Cipher Block Chaining
	openssl enc -aes-256-cbc -salt -in "$input_file" -out "$output_file" -pass pass:"$password"
#salt : adds an extra string to the cipher to make decryption more difficult
	rm $input_file
}

decrypt() {
	local input_file="$1"
	local output_file="$2"
	local password="$3"
	openssl enc -d -aes-256-cbc -in "$input_file" -out "$output_file" -pass pass:"$password"
# -d indicates decryption
}

echo "Encryption script"
echo "1: Encrypt a file"
echo "2: Decrypt the file"
echo "3: Exit"

read -p "Enter you choice (1/2/3) " answer

case $answer in
	1) 

	read -p "Enter path of input file: " input_file
	read -p "Enter path for the output file: " output_file
	read -sp "Enter the password: " password
	echo
	encrypt "$input_file" "$output_file" "$password"
		;;
	2)
	read -p "Enter path of encrypted input file: " input_file
	read -p "Enter path of decrypted output file: " output_file
	read -sp "enter the decryption password: " password
	echo
	decrypt "$input_file" "$output_file" "$password"
		;;
	3)
	echo "Now exiting script"
	exit 1
		;;
	*) 
	exit 0
		;;
esac
