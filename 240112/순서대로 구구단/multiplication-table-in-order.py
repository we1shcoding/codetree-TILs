a, b = map(int, input().split())

for i in range(1, 10):
        for j in range(a, b+1):
            print(f'{j} * {i} = {i * j}', end = '  ')
        if a>b:
            for j in range(b, a+1):
                print(f'{i} * {j} = {i * j}', end = '  ')
        print()