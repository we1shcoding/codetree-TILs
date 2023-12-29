def is_perfect_number(n):
    divisor_sum = 0

    for i in range(1, n):
        if n % i == 0:
            divisor_sum += i

    return divisor_sum == n

# 숫자 입력 받기
n = int(input())

# 완전수 여부 판단 및 출력
if is_perfect_number(n):
    print('P')
else:
    print('N')