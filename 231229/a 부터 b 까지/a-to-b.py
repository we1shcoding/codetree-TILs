def print_numbers(a, b):
    while a <= b:
        print(a, end=' ')
        if a % 2 == 1:  # 홀수인 경우
            a *= 2
        else:           # 짝수인 경우
            a += 3

# 입력 받기
a, b = map(int, input().split())

# 함수 호출하여 출력
print_numbers(a, b)