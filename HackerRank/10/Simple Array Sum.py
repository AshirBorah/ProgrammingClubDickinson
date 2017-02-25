#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/simple-array-sum

#!/bin/python

import sys

sum=0
n = int(raw_input().strip())
arr = map(int,raw_input().strip().split(' '))
for x in arr:
    sum+=x
    print sum
