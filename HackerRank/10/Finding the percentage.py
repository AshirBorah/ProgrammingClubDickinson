#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/finding-the-percentage

if __name__ == '__main__':
  dict = {}
  for i in xrange(int(raw_input())):
    line=raw_input().split()
    dict[line[0]]=sum(map(float,line[1:]))/3
  print '%.2f' %(dict[raw_input()])
