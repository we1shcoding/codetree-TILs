elements = list(map(int, input().split()))

# 3의 배수가 처음으로 등장하는 인덱스 찾기
index_of_first_multiple_of_3 = elements.index(next(x for x in elements if x % 3 == 0))

# 3의 배수가 처음으로 등장하는 부분의 바로 앞 원소 출력
result = elements[index_of_first_multiple_of_3 - 1]
print(result)