# Enter your code here. Read input from STDIN. Print output to STDOUT
import math

T = int(input())

for i in range (0, T):
    n = int(input())
    result = "Prime"
    if(n == 1):
        result = "Not prime"
    else:
        for j in range(2, int(math.sqrt(n) + 1)):
            if(n % j == 0 or n == 1):
                result = "Not prime"
                break
    print(result)