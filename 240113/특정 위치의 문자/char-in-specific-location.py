my_array = ['L', 'E', 'B', 'R', 'O', 'S']

# 사용자로부터 문자 입력 받기
user_input = input()

# 입력된 문자가 배열에 있는지 확인하고 인덱스 출력
if user_input in my_array:
    position = my_array.index(user_input)
    print(position)
else:
    print("None")