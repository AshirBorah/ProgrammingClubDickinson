#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/python-string-formatting

def print_formatted(number):
    wid=len(format(number,'b'))
    for i in xrange(1,number+1):
        print format(i,'d').rjust(wid,' '), format(i,'o').rjust(wid,' '), format(i,'x').upper().rjust(wid,' '), format(i,'b').rjust(wid,' ')
