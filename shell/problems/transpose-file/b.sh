#!/usr/bin/env bash

a=( )
n=0
cols=0
while read -a line; do
  cols=${#line[@]}
  for ((i=0; i < ${#line[@]}; i++)); do
    a[$n]=${line[$i]}
    ((n++))
  done
done < file.txt

for (( i = 0; i < $cols; i++ )); do
  for (( j = i; j < ${#a[@]}; j += $cols )); do
    [ $i != $j ] && echo -n " "
    echo -n "${a[$j]}"
  done
  echo
done
