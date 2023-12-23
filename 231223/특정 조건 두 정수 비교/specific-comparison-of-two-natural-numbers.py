# 두 정수를 입력 받기
a, b = map(int, input().split())

# 조건에 따라 결과값 계산
result = 1 if a < b else 0
result_equal = 1 if a == b else 0

# 결과 출력
print(result, result_equal)