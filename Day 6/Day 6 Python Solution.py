# Enter your code here. Read input from STDIN. Print output to STDOUT
tests = int(input())

for i in range(0, tests):
    s = input()
    print(s[::2], s[1::2])


