n = int(input())
sum_val = 0
cnt = 0

for _ in range(n):
    a = int(input())
    sum_val += a
    cnt += 1
avg_val = sum_val / cnt
print(sum_val, end = ' ')
print(f'{avg_val:.1f}')