#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/a-very-big-sum
#!/bin/python

import sys

sum=0
n = int(raw_input().strip())
arr = map(long,raw_input().strip().split(' '))
for x in arr:
    sum+=x
    print sum
