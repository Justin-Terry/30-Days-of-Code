# Enter your code here. Read input from STDIN. Print output to STDOUT

returned = list(map(int, input().split(" ")))
dueDate = list(map(int, input().split(" ")))

fine = 0

if(returned[2] == dueDate[2]):
    #Same year
    if(returned[1] == dueDate[1]):
        # Same month
        if(returned[0] > dueDate[0]):
            # Calculate fine for number of days late, if it is late
            fine = (returned[0] - dueDate[0]) * 15
    else:
        # Calculate fine for number of months late, if it is late
        if(returned[1] > dueDate[1]):
            fine = (returned[1] - dueDate[1]) * 500
else:
    # Over a year late
    if(returned[2] > dueDate[2]):
        fine = 10000

print(fine)
