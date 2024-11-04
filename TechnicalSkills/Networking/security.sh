#!/bin/bash


echo "Checking Security..."
echo "Checking for open ports..."

#www.cyberciti.biz/faq/how-to-check-open-ports-in-linux-using-the-cli/
ss -tulpn | grep 'LISTEN' | awk '{print $5}'

echo "Now checking for recent log-in"

#www.makeuseof.com/list-of-logged-in-users-on-linux/ 
last -p now | head -n -2
 
echo "Now checking for recent ssh..."

ss -tulpn | grep 'LISTEN' | grep '22'

echo "Do you want to check today's system logs?"
read answer
#raspberrypi.stackexchange.com/questions/79525/accessing-the-system-log-on-raspbian
time=$(date +"%b %d")
if [ "$answer" = "yes" ] ; then
	journalctl | grep "$time"
else 
	exit 1
fi

#person=`last -p now | awk `{print $1}` | grep pi`
#echo $person
#
#if [ "$person" == "pi" ] ; then
#	echo "$person is okay"
#elif [ "$person" =! "pi" ] ; then
#	echo "$person is an intruder"
#	echo "Kill session now for $person"
#	exit
#fi
#
#echo "checking for ssh connections"
#netstat -tnpa | awk `{print $5, $6} | grep ESTABLISHED
#
#echo "checking system logs"
#cat /var/log/boot.log | grep `error|fail|denied`
#
#echo "Checking running processes"
#ps -eo user,pid,%mem --sort=%mem | tail -n 5
