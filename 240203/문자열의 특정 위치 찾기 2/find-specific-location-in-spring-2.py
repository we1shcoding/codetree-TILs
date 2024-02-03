# 문자열 초기화
strings = ["apple", "banana", "grape", "blueberry", "orange"]

# 영문자 입력 받기
given_char = input()

# 조건을 만족하는 문자열 찾기
matching_strings = [string for string in strings if given_char in string[2:4]]

# 찾아낸 문자열 출력
for string in matching_strings:
    print(string)

# 조건을 만족하는 문자열의 개수 출력
print(len(matching_strings))