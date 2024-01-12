n = int(input())
numbers = list(map(int, input().split()))

# 주어진 수들 중에서 최솟값을 찾아 최대 공약수를 구함
min_number = min(numbers)

# 최대 공약수의 약수들을 찾아서 출력
for i in range(1, min_number + 1):
    if all(number % i == 0 for number in numbers):
        print(i)