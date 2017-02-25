#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/string-validators

if __name__ == '__main__':
    s = raw_input()
    print any(char.isalnum() for char in s)
    print any(char.isalpha() for char in s)
    print any(char.isdigit() for char in s)
    print any(char.islower() for char in s)
    print any(char.isupper() for char in s)
