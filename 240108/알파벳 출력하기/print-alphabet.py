def print_alphabet_triangle(n):
    start_char = ord('A')
    current_char = start_char
    
    for i in range(1, n + 1):
        row = ""
        for j in range(i):
            row += chr(current_char)
            current_char = (current_char - start_char + 1) % 26 + start_char
        print(row)

# 입력 받기
n = int(input())

# 알파벳 삼각형 출력
print_alphabet_triangle(n)