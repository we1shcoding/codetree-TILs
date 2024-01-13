n = int(input())

# n개의 숫자 입력
numbers = list(map(int, input().split()))

# 2가 3번째로 등장하는 숫자 찾기
count_2 = 0
for index, number in enumerate(numbers):
    if number == 2:
        count_2 += 1
        if count_2 == 3:
            position = index + 1  # 위치는 1부터 시작
            print(position)
            break

# 2가 3번째로 등장하지 않는 경우
if count_2 < 3:
    print("None")