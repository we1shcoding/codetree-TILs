N = int(input())

# N개의 정수를 리스트로 입력
numbers = list(map(int, input().split()))

# 리스트에서 최솟값과 해당 값의 개수 초기화
min_value = float('inf')
min_count = 0

# 리스트를 순회하며 최솟값과 해당 값의 개수 갱신
for num in numbers:
    if num < min_value:
        min_value = num
        min_count = 1
    elif num == min_value:
        min_count += 1

# 결과 출력
print(min_value, min_count)