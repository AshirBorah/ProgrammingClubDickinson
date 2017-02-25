#Author:Ashir Borah
#url: https://www.hackerrank.com/challenges/pangrams
# Enter your code here. Read input from STDIN. Print output to STDOUT
s=set(raw_input().lower().strip()).difference({' '})
if(len(s)==26):
    print 'pangram'
else:
    print 'not pangram'
