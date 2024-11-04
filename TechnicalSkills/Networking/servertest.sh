#!/bin/bash

echo "Running download speed test..."
location=$(speedtest-cli | grep 'Hosted by'| cut -b 11-)
echo "Server testing from $location"

download=$(speedtest-cli | grep 'Download' | awk '{ print $2}' | cut -d. -f1)
echo "Your download speed is $download Mbit/s"

case $download in 
	[1-29]) echo "Your download speed is slow."
		;;
	[30-89]) echo "Your download speed is okay."
		;;
	[90-100]) echo "Your download speed is great."
		;;
	*) echo "wow"
esac

upload=$(speedtest-cli | grep 'Upload' | awk '{ print $2,$3}')
echo "Your upload speed is $upload"

date=$(date +"%A, %b %d, %Y %I:%M%p")

echo "$date
Server testing from $location
Your download spped is $download Mbit/s
Your upload speed is $upload
" >> speedtest.log

sudo chmod 600 speedtest.log


