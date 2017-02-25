#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/python-lists

if __name__ == '__main__':
    lst=[]
    N = int(raw_input())
    for i in xrange(N):
      str=raw_input().split()
      if str[0]=='insert':
          lst.insert(int(str[1]),int(str[2]))
      elif str[0]=='remove':
        lst.remove(int(str[1]))
      elif str[0]=='sort':
        lst=sorted(lst)
      elif str[0]=='append':
        lst.append(int(str[1]))
      elif str[0]=='pop':
        lst.pop()
      elif str[0]=='reverse':
        lst.reverse()
      elif str[0]=='print':
        print lst
