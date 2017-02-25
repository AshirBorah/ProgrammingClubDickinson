#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/polar-coordinates

#!/usr/bin/python
# -*- coding: utf-8 -*-
# Enter your code here. Read input from STDIN. Print output to STDOUT

import cmath

c_input= complex(raw_input())
print abs(c_input)
print cmath.phase(c_input)
