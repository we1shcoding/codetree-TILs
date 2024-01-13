# 정수 n 입력 받기
n = int(input())

# 누적 합 변수 초기화
total_sum = 0

# n개의 정수를 공백으로 구분하여 입력 받아서 누적 합 계산
numbers = input().split()
for i in range(n):
    num = int(numbers[i])
    total_sum += num

# 합 출력
print(total_sum)

# 평균 계산 및 출력
average = total_sum / n
rounded_average = round(average, 1)
print(rounded_average)