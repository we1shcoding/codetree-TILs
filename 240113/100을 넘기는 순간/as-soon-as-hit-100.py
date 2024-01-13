n = int(input())

total_sum = 0
count = 0

numbers = list(map(int, input().split()))

for num in numbers:
    total_sum += num
    count += 1

    if num >= 100:
        break

average = total_sum / count

print(total_sum)
print(average)