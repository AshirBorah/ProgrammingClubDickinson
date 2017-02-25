#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/python-mutations

def mutate_string(string, position, character):
    return string[:position]+character+string[position+1:]
