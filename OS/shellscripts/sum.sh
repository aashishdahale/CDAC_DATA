#!/bin/bash


echo -n "enter n1 :"
read a
echo -n "enter n2 :"
read b


sum=`expr $a + $b` 
# use backquote when using cmd in statement

echo "the sum is $sum"
