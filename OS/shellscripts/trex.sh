#!/bin/bash

   echo -n "enter name :"
   read name
   
   first=`echo "$name" | cut -c 1`
   
   len=`echo -n "$name" | wc -c`
   
   x=2
   remaining=""
   while [ $x -le $len ]
   do
      ch=`echo "$name" | cut -c $x`
      remaining=$remaining$ch
      ((x=x+1))
   done
   
   uc1=`echo "$first" | tr [a-z] [A-Z]`
   lc2=`echo "$remaining"| tr [A-Z] [a-z]`
   final=$uc1$lc2
   echo "$final"
   
   
   
    
   
   
   
   
