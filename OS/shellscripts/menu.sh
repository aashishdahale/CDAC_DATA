#/bin/bash

echo -n  " enter num :"
read num

while [ 1 -gt 0 ]
do

echo -n "enter choice 1 show square, 2 show cube ,3 quit"

read choice


case $choice in

  1) sqr=`expr $num \* $num`
     echo "sqaure = $sqr"
     ;;
     
   2) cube=`expr $num \* $num \* $num`
     echo "cube = $cube"
     ;;
  
   3) break
      ;;
   *) echo "wrong choice"
   	;;
esac   
  

done


