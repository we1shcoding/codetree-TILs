a, b = map(int, input().split())

# 각 나눗셈 연산마다 나온 나머지들이 등장한 횟수를 저장할 딕셔너리 초기화
remainder_count = {}

# 나눗셈 연산 진행 및 나머지 횟수 카운트
while a > 1:
    remainder = a % b
    if remainder in remainder_count:
        remainder_count[remainder] += 1
    else:
        remainder_count[remainder] = 1
    a //= b

# 각 나눗셈 연산마다 나온 나머지들의 횟수 제곱의 합 계산
sum_of_squares = sum(count ** 2 for count in remainder_count.values())

# 결과 출력
print(sum_of_squares)