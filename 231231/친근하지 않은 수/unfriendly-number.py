def count_unfriendly_numbers(n):
    unfriendly_count = 0

    for num in range(1, n + 1):
        # 숫자가 2, 3, 또는 5로 나누어 떨어지는지 확인
        if num % 2 == 0 or num % 3 == 0 or num % 5 == 0:
            # 친근하지 않은 수이므로 continue를 사용하여 다음 반복으로 이동
            continue

        # 여기까지 도달한 경우는 친근하지 않은 수가 아니므로 개수를 증가
        unfriendly_count += 1

    return unfriendly_count

# 테스트를 위해 n 값 설정
n = int(input())
result = count_unfriendly_numbers(n)

print(f"{result}")