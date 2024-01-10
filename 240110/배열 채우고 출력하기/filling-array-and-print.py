# 10개의 문자를 저장할 배열 생성
char_array = []

# 10개의 문자 입력받기
input_chars = input().split()

# 입력받은 문자를 배열에 저장
for char in input_chars:
    char_array.append(char)

# 배열의 문자를 거꾸로 출력
reversed_chars = char_array[::-1]
print(''.join(reversed_chars))