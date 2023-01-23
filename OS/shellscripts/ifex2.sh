#!/bin/bash

echo -n  "enter the number :"
read n1

if [ $n1 -gt 100 ]
then
  echo "$n1 > 100"
elif [ $n1 -lt 100 ]
then
   echo "$n1 < 100 "
else
   echo "$n1"
fi
