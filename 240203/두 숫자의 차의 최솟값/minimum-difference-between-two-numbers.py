n = int(input())
arr = list(map(int,input().split()))

# 두 수의 최대 차이값
minus = max(arr)

for i in range(n):
    for j in range(i+1,n):
        if arr[j]-arr[i]<minus:
            minus = arr[j]-arr[i]
print(minus)