n = int(input())

# 위쪽 삼각형 출력
for i in range(1, n + 1):
    print('*' * i)
    print()
# 아래쪽 역삼각형 출력
for i in range(n - 1, 0, -1):
    print('*' * i)
    print()