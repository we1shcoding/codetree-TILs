gander = int(input())
age = int(input())

if gander == 0 and age >= 19:
    print('M')
elif gander == 0 and age < 19:
    print('B')
elif gander == 1 and age >= 19:
    print('W')
elif gander == 1 and age < 19:
    print('G')