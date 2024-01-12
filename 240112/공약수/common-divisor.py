def find_common_divisors(n, numbers):
    # 주어진 수 중에서 최솟값을 찾아 최대 공약수를 구함
    min_number = min(numbers)
    
    # 최대 공약수의 약수들을 찾아서 반환
    common_divisors = [i for i in range(1, min_number + 1) if min_number % i == 0]
    
    return common_divisors

# 입력 받기
n = int(input())
numbers = list(map(int, input().split()))

# 공약수 찾기
common_divisors = find_common_divisors(n, numbers)

# 결과 출력
for divisor in common_divisors:
    print(divisor)