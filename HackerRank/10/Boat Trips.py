#Author: Ashir Borah
#url: https://www.hackerrank.com/contests/w28/challenges/boat-trip

#!/bin/python

import sys


n,c,m = raw_input().strip().split(' ')
n,c,m = [int(n),int(c),int(m)]
p = map(int, raw_input().strip().split(' '))
if all(x<=c*m for x in p):
  print 'Yes'
else:
  print 'No'
