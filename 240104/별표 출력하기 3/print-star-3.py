n = int(input())

for i in range(n): 

    for j in range(0 + i):

        print("", end="  ")

    for j in range(1,2*(n-i)):

        print('*',end=' ')

    print()