a, b = map(int, input().split())
cnt = 0

if a <= b:
    for i in range(a, b+1):
        for j in range(1, 10):
            cnt += 1
            print(f'{i} * {j} = {j*i}', end='  ')
            if cnt % 3 == 0:
                print()
print()            
            
else:
    for i in range(a, b-1, -1):
        for j in range(1, 10):
            cnt += 1
            print(f'{i} * {j} = {j*i}', end='  ')
            if cnt % 3 == 0:
                print()
print()