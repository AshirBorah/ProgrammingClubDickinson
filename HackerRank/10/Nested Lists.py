#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/nested-list

a= [[raw_input(),float(raw_input())] for x in xrange(int(raw_input()))]
b = sorted(set(x[1] for x in a))
for name in sorted(x[0] for x in a if b[1]==x[1]):
  print name
