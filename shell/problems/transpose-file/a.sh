#!/usr/bin/env bash

a=
while read -a line; do
    for (( i=0; i < "${#line[@]}"; i++ )); do
        a[$i]="${a[$i]} ${line[$i]}"
    done
done < file.txt

for i in "${a[@]}"; do
    echo "${i# *}"
done
