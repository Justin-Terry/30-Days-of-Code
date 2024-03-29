#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(meal_cost, tip_percent, tax_percent):
    tipAmount = (meal_cost * (tip_percent/100.0));
    taxAmount = (meal_cost * (tax_percent/100.0));
    total = meal_cost + tipAmount + taxAmount;
    print(round(total));

if __name__ == '__main__':
    meal_cost = float(input())

    tip_percent = int(input())

    tax_percent = int(input())

    solve(meal_cost, tip_percent, tax_percent)
