a, b = map(int, input().split())
sum_val = 0

# a부터 b까지 5의 배수만을 골라 합산
for num in range(a + (5 - a % 5), b + 1, 5):
    sum_val += num

print(sum_val)