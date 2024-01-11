numbers = list(map(int, input().split()))

# 짝수 번째로 입력된 값의 합을 구하기
even_sum = sum(numbers[1::2])

# 3의 배수 번째로 입력된 값의 평균을 구하기
divisible_by_3_values = numbers[2::3]
average_divisible_by_3 = sum(divisible_by_3_values) / len(divisible_by_3_values)

# 결과 출력
print(f"{even_sum} {average_divisible_by_3:.1f}")