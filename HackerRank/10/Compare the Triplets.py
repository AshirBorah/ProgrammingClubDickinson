#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/compare-the-triplets
#!/bin/python

import sys

a0,a1,a2 = raw_input().strip().split(' ')
a = [int(a0),int(a1),int(a2)]
b0,b1,b2 = raw_input().strip().split(' ')
b = [int(b0),int(b1),int(b2)]
z=[0,0]
p=zip(a,b)
for x in p:
    if x[0]>x[1]:
        z[0]+=1
    elif x[0]<x[1]:
        z[1]+=1
        print z[0],z[1]    
