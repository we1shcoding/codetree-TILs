n = int(input())

if n == 2:
    days = 28
elif n in {4, 6, 9, 11}:
    days = 30
else:
    days = 31

print (days)