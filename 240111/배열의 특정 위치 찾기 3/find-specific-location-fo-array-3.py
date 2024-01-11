# 최대 100개의 정수를 공백을 기준으로 입력받아 리스트에 저장
numbers = list(map(int, input().split()))

# 0이 처음으로 나타나는 인덱스를 찾기
index_of_first_zero = numbers.index(0)

# 0을 기준으로 마지막으로 주어진 3개의 정수의 합을 출력
result = sum(numbers[index_of_first_zero - 3:index_of_first_zero])
print(result)