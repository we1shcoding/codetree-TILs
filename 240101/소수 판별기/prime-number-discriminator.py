n  int(input())

count_val = 0
for i in range(2,n):
    if n%i == 0:
        count_val+=1

print('P' if not count_val else 'C')