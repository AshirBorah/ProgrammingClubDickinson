#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/write-a-function

def is_leap(year):
    leap = False
    if year%4!=0:
        leap=False
    else:
      if year%100!=0:
        leap=True
      else:
        if year%400!=0:
          leap=False
        else:
          leap=True

    # Write your logic here

    return leap
