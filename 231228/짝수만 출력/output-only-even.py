a, b = map(int, input().split())
num = a
while num <= b:
    if num % 2 == 0:
        print(num, end = ' ')
    num += 1