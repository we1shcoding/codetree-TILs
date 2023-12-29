def calculate_sum_of_multiples_of_5(a, b):
    total_sum = 0

    for num in range(a, b + 1):
        if num % 5 == 0:
            total_sum += num

    return total_sum

# 입력 받기

a, b = map(int, input().split())

# 5의 배수들의 합 구하고 출력
sum_result = calculate_sum_of_multiples_of_5(a, b)
print(f"{sum_result}")