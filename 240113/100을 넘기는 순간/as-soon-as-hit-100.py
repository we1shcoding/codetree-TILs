# 정수 n 입력 받기
n = int(input())

# 누적 합 변수 초기화
total_sum = 0

numbers = input().split()
for i in range(n):
    num = int(numbers[i])
    total_sum += num

avg = total_sum / n
print(total_sum)
print(f'{avg:.1f}')