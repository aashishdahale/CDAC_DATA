#!/bin/bash


echo "\$0 = $0 , \$1= $1  \$2=$2"

echo "\$#=$#  , \$@=$@"

sum=0
#for x in $@
#do
 #sum=`expr $sum + $x`
#done


while [ $# -gt 0 ]
do
   sum=`expr $sum + $1`
   shift
done
#echo "\$@= $@  \$1=$1"
#shift
#echo "\$@= $@  \$1=$1"



echo "$sum"













