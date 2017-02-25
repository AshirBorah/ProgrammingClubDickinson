#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/insertionsort2
#!/bin/python
def insertionSort(arr):
    for i in xrange(1,len(arr)):
        temp=arr[i]
        j=i-1
        while temp<arr[j] and j>=0:
            arr[j+1]=arr[j]
            j-=1
            arr[j+1]=temp
            printA( arr)

            def printA(arr):
                for x in arr:
                    print x,
                    print

                    m = input()
                    ar = [int(i) for i in raw_input().strip().split()]
                    insertionSort(ar)
