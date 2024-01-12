n, m = map(int, input().split())
cnt = 0
for _ in range(m):
    for _ in range(n):
        cnt+=1
        print(cnt, end=' ')
        if cnt % m == 0:
            print()