#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input())
    tempMax = 0
    ourMax = 0

    while n >= 1:
        if(n%2 == 1):              # If the bit is going to be a 1
            tempMax += 1              # Increment tempMax
            if(tempMax > ourMax): 
                ourMax = tempMax      # Update max if a new max was found
        else:
            tempMax = 0            # Reset temp max
        
        n = int(n/2);                    # Remove the bit we've determined from n
        
    print (ourMax)

