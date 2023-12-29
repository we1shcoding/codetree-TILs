def calculate_sum_and_average(a, b):
    total_sum = 0
    count = 0

    for num in range(a, b + 1):
        if num % 5 == 0 or num % 7 == 0:
            total_sum += num
            count += 1

    if count == 0:
        average = 0
    else:
        average = total_sum / count

    return total_sum, average

# 입력 받기
a, b = map(int, input().split())

# 합과 평균 구하고 출력
sum_result, average_result = calculate_sum_and_average(a, b)
print(f"{sum_result}", end= ' ')
print(f"{average_result:.1f}")