a, b = map(int, input().split())

for i in range(1, 10):
    for j in range(a, b+1):
        print(f"{j} * {i} = {j*i}  ", end="")
    print()