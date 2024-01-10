n = int(input())

# n개의 정수 입력 받기
numbers = list(map(int, input().split()))

# 역순으로 짝수 출력
even_numbers = [str(num) for num in numbers[::-1] if num % 2 == 0]
print(' '.join(even_numbers))