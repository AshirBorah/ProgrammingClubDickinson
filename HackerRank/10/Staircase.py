#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/staircase
#!/bin/python

import sys

n = int(raw_input().strip())
for x in xrange(n):
    print str('#'*(x+1)).rjust(n,' ')
