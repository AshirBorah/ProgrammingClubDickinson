#Author: Ashir Borah
#url: https://www.hackerrank.com/challenges/insertionsort1
#!/bin/python
def insertionSort(arr):
    temp=arr[-1]
    x=len(arr)-2
    while temp<=arr[x]and x>=0:
        arr[x+1]=arr[x]
        printA(arr)
        x-=1
        arr[x+1]=temp
        printA(arr)

        def printA(arr):
            for x in arr:
                print x,
                print

                m = input()
                ar = [int(i) for i in raw_input().strip().split()]
                insertionSort(ar)
