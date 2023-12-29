n = int(input())
sum_val = 0
for _ in range(n):
    a = int(input())
    if a % 3 == 0 and a % 2 == 1:
        sum_val += a
print(sum_val)