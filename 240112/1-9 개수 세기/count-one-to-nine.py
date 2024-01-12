n = int(input())
elements = list(map(int, input().split()))

# 1부터 9까지 각각의 숫자가 몇 번씩 나왔는지 저장할 리스트 초기화
count_list = [0] * 9

# 각 숫자의 개수 세기
for element in elements:
    count_list[element - 1] += 1

# 결과 출력
for count in count_list:
    print(count)