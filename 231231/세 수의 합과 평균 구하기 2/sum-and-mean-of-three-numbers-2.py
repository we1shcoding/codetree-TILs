a, b, c = map(int, input().split())
sum_val = 0
avg_val = 0
cnt = 3

sum_val = a+b+c
avg_val = sum_val // cnt

print('avg', avg_val)
print('sum', sum_val)