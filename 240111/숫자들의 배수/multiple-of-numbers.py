n = int(input())
arr = [n]
loop = 1
while True:
    cnt = 0
    loop += 1
    arr.append(n * loop)
    for i in range(len(arr)):
        if arr[i] % 5 == 0:
            cnt += 1
    if cnt == 2:
        break
print(*arr)