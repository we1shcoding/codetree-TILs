sum_val = 0
cnt = 0
for _ in range(10):
    num = int(input())
    if 0 <= num <= 200:
        sum_val += num
        cnt += 1
avg_val = sum_val / cnt
print(sum_val, end = ' ')
print(f'{avg_val:.1f}')