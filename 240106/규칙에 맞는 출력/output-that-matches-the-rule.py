n = int(input())

for i in range(n, 0, -1):
    row_numbers = [str(j) for j in range(i, n + 1)]
    print(" ".join(row_numbers))