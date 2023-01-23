

str=`sort -k 3 -r -n data | head -1`

for x in $str
do
   echo "$x"
   break
done
