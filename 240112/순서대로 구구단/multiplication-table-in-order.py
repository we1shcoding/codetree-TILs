a, b = map(int, input().split())

# a가 b보다 작거나 같은 경우
if a <= b:
    for i in range(1, 10):
        for j in range(a, b + 1):
            print(f'{j} * {i} = {i * j}', end='  ')
        print()

# a가 b보다 큰 경우
else:
    for i in range(1, 10):
        for j in range(a, b - 1, -1):
            print(f'{j} * {i} = {i * j}', end='  ')
        print()