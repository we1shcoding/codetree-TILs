# 주사위 결과를 10번 입력 받기
arr = list(map(int, input().split()))

# 1부터 6까지 각 숫자가 몇 번씩 나왔는지 저장할 리스트 초기화
count_arr = [0] * 7

# 각 숫자의 개수 세기
for elem in arr:
    count_arr[elem] += 1

# 결과 출력
for i in range(1, 7):
    print(f"{i} - {count_arr[i]}")