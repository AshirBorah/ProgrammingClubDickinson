#Author: Ashir Borah
#url: https://www.hackerrank.com/contests/w28/challenges/the-great-xor
#!/bin/python

import sys
import math

q = int(raw_input().strip())
for a0 in xrange(q):
    #print 'New'
    x = long(raw_input().strip())
    length=int(math.log(x,2))
    y = x ^ (1<<length)
    max = 0 ^(1<<length)
    #print y,'y'
    #print max,'max'
    #print length,'len'
    print max-y-1
    # your code goes here
