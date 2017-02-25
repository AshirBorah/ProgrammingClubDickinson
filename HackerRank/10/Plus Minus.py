#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/plus-minus

#!/bin/python

import sys

n = int(raw_input().strip())
arr = map(int,raw_input().strip().split(' '))
zero=neg=pos=0
for x in arr:
    if x>0:
        pos+=1
    elif x==0:
        zero+=1
    else:
        neg+=1
        print '%0.6f'%(float(pos)/len(arr))
        print '%0.6f'%(float(neg)/len(arr))
        print '%0.6f'%(float(zero)/len(arr))
