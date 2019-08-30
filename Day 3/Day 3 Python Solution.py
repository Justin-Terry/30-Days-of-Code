#!/bin/python3

import math
import os
import random
import re
import sys


def isEven(n):
    if(n%2 == 0):
        return True
    return False

if __name__ == '__main__':
    N = int(input())

    if not isEven(N):
        print("Weird")
    elif N in range(1, 6) and isEven(N):
        print("Not Weird")
    elif N in range(6, 21) and isEven(N):
        print("Weird")
    else:
        print("Not Weird")


