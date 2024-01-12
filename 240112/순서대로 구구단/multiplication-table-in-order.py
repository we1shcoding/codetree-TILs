a, b = map(int, input().split())

for i in range(1, 10):
    for j in range(a, b + 1):
        print(f'{j} * {i} = {i * j}', end='  ')
    print()

for i in range(1, 10):
    for j in range(b, a - 1, -1):  # 역순으로 출력하도록 수정
        if a > b:
            print(f'{j} * {i} = {i * j}', end='  ')
        print()