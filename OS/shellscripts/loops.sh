
x=0
while [ $x -le 20 ]
do
  echo "$x"
  #x=`expr $x + 1`
  ((x=x+1))
done
