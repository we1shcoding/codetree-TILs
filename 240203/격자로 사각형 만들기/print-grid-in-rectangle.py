# 입력 받기
n = int(input())

# 격자 생성 및 초기화
grid = [[0] * n for _ in range(n)]

# 첫 번째 행과 첫 번째 열 초기화
for i in range(n):
    grid[0][i] = 1
    grid[i][0] = 1

# 나머지 칸 채우기
for i in range(1, n):
    for j in range(1, n):
        grid[i][j] = grid[i-1][j] + grid[i][j-1] + grid[i-1][j-1]

# 결과 출력
for row in grid:
    print(" ".join(map(str, row)))