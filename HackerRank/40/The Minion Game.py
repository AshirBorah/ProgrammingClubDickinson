#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/the-minion-game

def minion_game(string):
    kev=stu=0
    vowels=['A','E','I','O','U']
    for x in xrange(len(string)):
        if string[x] in vowels:
            kev+=len(string)-x
        else:
            stu+=len(string)-x
            if kev>stu:
                print 'Kevin',kev
            elif kev==stu:
                print 'Draw'
            else:
                print 'Stuart', stu
