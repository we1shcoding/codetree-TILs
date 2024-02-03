n = int(input())
number = 0
graph = [[0]*n for _ in range(n)]
if n % 2 == 0:
    for i in range(n):
        i = n-i
        if i % 2 == 0:
            for j in range(n):
                j = n-j
                number = number + 1
                graph[j-1][i-1] = number
        else:
            for k in range(n):
                number = number + 1
                graph[k][i-1] = number
    for i in range(n):
        for j in range(n):
            print(graph[i][j], end=' ')
        print()
else:
    for i in range(n):
        i = n-i
        if i % 2 == 0:
           for k in range(n):
                number = number + 1
                graph[k][i-1] = number
        else:
             for j in range(n):
                j = n-j
                number = number + 1
                graph[j-1][i-1] = number
    for i in range(n):
        for j in range(n):
            print(graph[i][j], end=' ')
        print()