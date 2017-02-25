#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/diagonal-difference
#!/bin/python

import sys

leadD=0
antiD=0
n = int(raw_input().strip())
a = []
for a_i in xrange(n):
    a_temp = map(int,raw_input().strip().split(' '))
    a.append(a_temp)
    for x in xrange(n):
        leadD+=a[x][x]
        antiD+=a[x][-x-1]
        print abs(leadD-antiD)
