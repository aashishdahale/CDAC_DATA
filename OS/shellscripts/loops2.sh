#!/bin/bash

while [ 1 -gt 0 ]
do
  echo -n "enter name : "
  read name
  
  if [ $name == "quit" ]
  then
     break
  fi
  
  echo "Welcome $name"
done
