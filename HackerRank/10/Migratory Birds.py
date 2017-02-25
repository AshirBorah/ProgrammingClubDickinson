#Author: Ashir Borah
#url: https://www.hackerrank.com/contests/rookierank-2/challenges/migratory-birds

#!/bin/python

import sys


n = int(raw_input().strip())
types = map(int, raw_input().strip().split(' '))
# your code goes here
nums=[types.count(1),types.count(2),types.count(3),types.count(4),types.count(5)]
print nums.index(max(nums))+1
