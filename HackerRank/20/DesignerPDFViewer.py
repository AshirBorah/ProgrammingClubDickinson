#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/designer-pdf-viewer
#!/bin/python

import sys

h = map(int,raw_input().strip().split(' '))
word = raw_input().strip()
tallest=0
for char in word:
    height=h[ord(char)-ord('a')]
    if height>tallest:
        tallest= height
        print tallest*len(word)
