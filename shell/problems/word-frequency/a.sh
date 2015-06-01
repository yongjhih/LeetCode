#!/usr/bin/env bash

#tr ' ' '\n' < words.txt | grep .| sort | uniq -c | sort -r | while read v k; do
#    echo "$k $v"
#done

tr ' ' '\n' < words.txt | grep . | sort | uniq -c | while read v k; do
    echo "$k $v"
done | sort -k2 -nr
