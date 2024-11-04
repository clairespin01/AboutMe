#!/bin/bash
#
echo "please enter network range: ex 192.x.x.x"
read networkrange
echo "begging network scan"
nmap -sn $networkrange/24 
