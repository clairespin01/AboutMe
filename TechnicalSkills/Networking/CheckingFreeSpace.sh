#/bin/bash
#
amt=$(df -h | awk '{ print $5}' | grep % | grep -v Use | sed -n '3p' | cut -d "%" -f1)

case $amt in

	[1-4]*)
		echo "You're good! You have used $amt%"
		;;
	[50-89])
		echo "Half Full! You have used $amt%"
		;;
	[90-98]) 
		echo "Almost full! You have used $amt%"
		;;
	99)
		echo "Too full! You have used $amt%"
		;;
	*) 
		echo "No space left! You have used $amt%" 
		;;
esac


