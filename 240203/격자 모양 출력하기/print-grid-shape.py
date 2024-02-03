# 입력 받기
n, m = map(int, input().split())

# 격자 생성 및 초기화
grid = [[0] * n for _ in range(n)]

# 점의 정보 입력 받아서 격자에 채우기
for _ in range(m):
    row, col = map(int, input().split())
    size = row * col
    grid[row-1][col-1] = size

# 결과 출력
for row in grid:
    print(" ".join(map(str, row)))