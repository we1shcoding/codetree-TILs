# 입력 받기
n, m = map(int, input().split())

# 첫 번째 격자 입력 받기
grid1 = [list(map(int, input().split())) for _ in range(n)]

# 두 번째 격자 입력 받기
grid2 = [list(map(int, input().split())) for _ in range(n)]

# 새로운 격자 만들기
new_grid = [[0] * m for _ in range(n)]

# 격자 값 비교하여 새로운 격자 채우기
for i in range(n):
    for j in range(m):
        if grid1[i][j] != grid2[i][j]:
            new_grid[i][j] = 1

# 결과 출력
for row in new_grid:
    print(" ".join(map(str, row)))