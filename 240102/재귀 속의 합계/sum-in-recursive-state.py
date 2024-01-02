a = int(input())

current_number = 1
sum_result = 0

# while문을 사용하여 1부터 a까지의 합 계산
while current_number <= a:
    sum_result += current_number
    current_number += 1
    
print(sum_result)