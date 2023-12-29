n = int(input())
day_2, day_3, day_12 = 0, 0, 0

for day in range(1, n + 1):
    if day % 12 == 0:
        day_12 += 1
    elif day % 3 == 0:
        day_3 += 1
    elif day % 2 == 0:
        day_2 += 1

print(day_2, day_3, day_12)