# 배열에 정수를 입력받습니다.
arr = list(map(int, input().split()))
	
max_val = arr[0];
min_val = arr[0];
	
# 주어진 숫자들 중 최댓값과 최솟값을 구합니다.
for elem in arr:
	if elem == 999 or elem == -999:
		break
		
	if elem > max_val:
		max_val = elem
		
	if elem < min_val:
		min_val = elem
	
# 최댓값과 최솟값을 출력합니다.
print(max_val, min_val)