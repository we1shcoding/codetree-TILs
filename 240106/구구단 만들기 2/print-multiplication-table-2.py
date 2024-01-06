ab=input().split()
a=int(ab[0]);b=int(ab[1])
for i in range(2,9,2):
    for j in range(b,a-1,-1):
        print(f"{j} * {i} = {i * j}",end=" ")
        if j!=a:
            print("/", end=" ")
    print()