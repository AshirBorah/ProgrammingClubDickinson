#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/mini-max-sum
#!/bin/python

import sys

arr = map(int,raw_input().strip().split(' '))
arr=sorted(arr)
high=low=0
for x in xrange(4):
    high+=arr[x+1]
    low+=arr[x]
    print low,high
