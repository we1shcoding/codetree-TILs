a, b = map(int, input().split())
sum_val = 0
cnt = 0 # avg_val = sum_val / cnt

for num in range(a, b+1):
    if num % 5 == 0 or num % 7 == 0:
        sum_val += num
        cnt += 1
avg_val = sum_val / cnt
print(f'{sum_val}', end=' ')
print(f'{avg_val:.1f}')