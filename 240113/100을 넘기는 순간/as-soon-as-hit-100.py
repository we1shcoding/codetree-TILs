n = int(input())

total_sum = 0
count = 0

# 공백으로 구분된 여러 정수를 입력받아 리스트로 변환
numbers = list(map(int, input().split()))

for num in numbers:
    total_sum += num
    count += 1

    if num >= 100:
        break

average = round(total_sum / count, 1) if count > 0 else 0

print(total_sum)
print(average)