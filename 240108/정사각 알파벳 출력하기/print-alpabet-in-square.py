def print_alphabet_square(n):
    start_char = ord('A')
    
    for i in range(n):
        row = ""
        for j in range(n):
            char = chr(start_char + i * n + j)
            row += char
        print(row)

# 입력 받기
n = int(input())

# 알파벳 정사각형 출력
print_alphabet_square(n)