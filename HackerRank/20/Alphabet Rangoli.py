#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/alphabet-rangoli

def print_rangoli(size):
    for i in xrange(size,0,-1):
        str=''
        for j in xrange(size,i-1,-1):
            str+= chr(96+j)+'-'
            for j in xrange(i+1,size+1,1):
                str+= chr(96+j)+'-'
                print str.center(2*(2*size-1)-1,'-')[:2*(2*size-1)-1]
                for i in xrange(2,size+1,1):
                    str=''
                    for j in xrange(size,i-1,-1):
                        str+= chr(96+j)+'-'
                        for j in xrange(i+1,size+1,1):
                            str+= chr(96+j)+'-'
                            print str.center(2*(2*size-1)-1,'-')[:2*(2*size-1)-1]      
