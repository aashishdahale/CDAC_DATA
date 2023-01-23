#!/bin/bash


echo -n  "enter the number :"
read n1

s=`expr $n1 % 2`

if [ $s -eq 0 ]
then
   echo "$n1 is even"
else
   echo "$n1 is odd"
fi

folder="/home123"
if [ -d $folder ]
then
   echo " folder exists"
 else
 echo "folder does not exist"
fi






