n = int(input())

# 모양에 맞게 윗쪽 별을 출력합니다.
for i in range(n):
	for _ in range(n - i - 1):
		print(" ", end=" ")
	for _ in range(i + 1):
		print("@", end=" ")
	print()

# 모양에 맞게 아랫쪽 별을 출력합니다.
for i in range(n - 2, -1, -1):
	for _ in range(i+1):
		print("@", end=" ")
	print()