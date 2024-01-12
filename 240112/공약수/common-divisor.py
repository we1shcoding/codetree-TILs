n = int(input())
a, b = map(int, input().split())
numbers = [a, b]
min_number = min(numbers)

# 최대 공약수의 약수들을 찾아서 출력
for i in range(1, min_number + 1):
    if min_number % i == 0:
        print(i)