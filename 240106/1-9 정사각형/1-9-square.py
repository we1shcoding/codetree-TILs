n = int(input())
cnt = 1

for i in range(n):
    for j in range(n):
        print(cnt, end='')
        cnt = (cnt % 9) + 1
    print()