#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/list-comprehensions

if __name__ == '__main__':
    x = int(raw_input())
    y = int(raw_input())
    z = int(raw_input())
    n = int(raw_input())
    print [[a,b,c] for a in xrange(x+1) for b in xrange(y+1) for c in xrange(z+1) if a+b+c!=n]
