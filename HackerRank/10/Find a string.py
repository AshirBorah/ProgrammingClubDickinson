#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/find-a-string

def count_substring(string, sub_string):
  count=0
  x=0
  skip=sub_string.find(sub_string[0],1,len(sub_string))
  if skip==-1:
    skip=len(sub_string)
 # print skip, 'skip'
  while x in xrange(len(string)):
    x=string.find(sub_string,x,len(string))
    if x>=0:
      count+=1
      x+=skip
    elif x==-1:
      return count
    #print x
  return count
