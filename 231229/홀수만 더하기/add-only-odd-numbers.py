def calculate_odd_multiple_of_3_sum(numbers):
    result_sum = 0
    for num in numbers:
        if num % 2 == 1 and num % 3 == 0:
            result_sum += num
    return result_sum

# 입력 받기
n = int(input())
numbers = [int(input()) for _ in range(n)]

# 홀수이면서 3의 배수인 수들의 합 구하고 출력
result = calculate_odd_multiple_of_3_sum(numbers)
print(f"{result}")