n, m = map(int, input().split())
arr = list(map(int, input().split()))
cnt = 0

for i in range(n):
    if arr[i] == m:
        cnt += 1
print(cnt)