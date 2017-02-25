#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/caesar-cipher-1
#!/bin/python

import sys


n = int(raw_input().strip())
s = raw_input().strip()
k = int(raw_input().strip())

cip=[]
for char in s:
    if char.isupper():
        cip.append(chr(((ord(char)-ord('A')+k)%26)+ord('A')))
    elif char.islower():
        cip.append(chr(((ord(char)-ord('a')+k)%26)+ord('a')))
    else:
        cip.append(char)
        print ''.join(cip)
