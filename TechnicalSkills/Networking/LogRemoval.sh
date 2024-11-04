#!/bin/bash

# Remove log file location
location="/home/pi/Documents/.remove.log"
# touch $location
# echo $location

# if user forgets to include the file being removed

if [ $# -eq 0 ] ; then
	echo "$0: not enough arguments"
	exit 1
fi

# Will not log user removal if option is added
if [ $1 = "-s" ] ; then
	exit 1
else 
	echo "${USER}, $(date) , $@ " >> $location
fi

/bin/rm "$@"

exit 0



