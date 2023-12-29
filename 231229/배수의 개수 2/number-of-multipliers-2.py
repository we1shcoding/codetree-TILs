cnt = 0
for _ in range(10):
    num = int(input())
    if num % 2 == 1:
        cnt += 1  # 홀수인 경우 카운트 증가

print(cnt)