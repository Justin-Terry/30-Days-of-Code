# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())

phoneBook = {}
for i in range(0, n):
    data = input().split(" ")
    phoneBook[data[0]] = data[1]

while True:
    try:
        s = input()
        if s in phoneBook.keys():
            print(s + "=" + phoneBook.get(s))
        else:
            print("Not found")
    except:
        break

