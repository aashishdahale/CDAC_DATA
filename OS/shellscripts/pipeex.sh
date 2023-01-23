#!/bin/bash

echo -n "enter the str :"
read str

len=`echo -n "$str" | wc -c`
i=1
while [ $i -le $len ]
do
  echo "$str" | cut -c $i
  ((i=i+1))
done
