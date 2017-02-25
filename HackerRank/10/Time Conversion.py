#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/time-conversion
#!/bin/python

import sys

time = raw_input().strip()
hour = int(time[:time.index(':')])
if time[-2]=='P' and hour!=12:
    hour = int(time[:time.index(':')])
    time=str(hour+12)+time[2:]
elif hour == 12 and time[-2]=='A':
    time='00'+time[2:]
    print time[:-2]
