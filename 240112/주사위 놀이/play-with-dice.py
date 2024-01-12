# 주사위 결과를 10번 입력 받기
dice_results = list(map(int, input().split()))

# 1부터 6까지 각 숫자가 몇 번씩 나왔는지 저장할 리스트 초기화
count_list = [0] * 6

# 각 숫자의 개수 세기
for result in dice_results:
    count_list[result - 1] += 1

# 결과 출력
for i in range(6):
    print(f"{i + 1} - {count_list[i]}")