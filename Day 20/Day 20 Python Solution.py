#!/bin/python3

import sys

n = int(input().strip())
a = list(map(int, input().strip().split(' ')))
# Write Your Code Here
numSwaps = 0
thisRound = 1
while (thisRound > 0):
    thisRound = 0
    for i in range(0, len(a)-1):
        if(a[i] > a[i+1]):
            a[i], a[i+1] = a[i+1], a[i]
            thisRound += 1
            numSwaps += 1
            
print("Array is sorted in", numSwaps,"swaps.")
print("First Element:", a[0])
print("Last Element:", a[len(a)-1])

