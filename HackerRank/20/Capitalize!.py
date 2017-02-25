#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/capitalize

def capitalize(string):
    st=''
    str=string.split(' ')
    for word in str:
        if word:
            if word[0].isalpha():
                st+= word[0].upper()+word[1:]+' '
            else:
                st+=word+' '
            else:
                st+=word+' '
                return st
