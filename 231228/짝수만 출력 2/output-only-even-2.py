b,a = map(int, input().split())
even_number = b

while even_number >= a:
    if b % 2 == 0:
        print(even_number, end=' ')
    even_number -= 2