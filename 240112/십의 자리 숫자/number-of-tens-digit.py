arr = list(map(int, input().split()))
arr_cnt = [0] * 10

for elem in arr:
    if elem == 0:
        break
    tens_digit = elem // 10
    arr_cnt[tens_digit] += 1

for i in range(1, 10):
    print(f'{i} - {arr_cnt[i]}')