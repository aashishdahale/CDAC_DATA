#/bin/bash

echo -n  " enter num :"
read num

while [ 1 -gt 0 ]
do

echo -n "enter choice 1 show square, 2 show cube ,3 quit"

read choice


if [ $choice -eq 1 ]
then
     sqr=`expr $num \* $num`
     echo "sqaure = $sqr"
elif [ $choice -eq 2 ]
then
   cube=`expr $num \* $num \* $num`
   echo "cube = $cube"
elif [ $choice -eq 3 ]
then
   break
else
    echo "wrong choice"
   
fi   
  
done


