day = int(input())

if day % 4 == 0 and (day % 100 != 0 or day % 400 == 0):
    print(1)
else:
    print(0)