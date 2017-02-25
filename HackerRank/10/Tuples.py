#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/python-tuples

if __name__ == '__main__':
    n = int(raw_input())
    integer_list = map(int, raw_input().split())
    tuple=()
    for i in integer_list:
      tuple+=(i,)
    print hash(tuple)
