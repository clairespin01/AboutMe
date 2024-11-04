#!/bin/bash

time=$(date +"%A, %b %d, %Y %I:%M%p")
echo "The date and time is $time"

address=$(ifconfig | grep "ether" | sed -n '2p' | cut -b 15-31)
echo "Your MAC address is $address"

ip=$(hostname -I | cut -b 1-15)
echo "Your IP address is $ip"

