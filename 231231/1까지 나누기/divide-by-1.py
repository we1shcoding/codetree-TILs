def count_divisions_to_one(n):
    total_divisions = 0

    for i in range(1, n + 1):
        n //= i
        total_divisions += 1

        if n <= 1:
            break

    print(f"{total_divisions}")

# 정수 n 입력 받기
n = int(input())
count_divisions_to_one(n)