from sys import stdin
n = int(stdin.readline())
arr=list(map(int,stdin.readline().split()))

#중복체크 후 최대값 찾기
#딕셔너리 활용
check = {}
for i in arr:
    if i in check:
        check[i]+=1
    else:
        check[i]=1

result = -1 #1~1000까지의 값임
for i in check: #key를 순서대로 받음
    if check[i] == 1:
        if result < i:
            result = i
print(result)