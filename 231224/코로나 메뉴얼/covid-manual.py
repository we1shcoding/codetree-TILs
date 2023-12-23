inp = input().split()
a1, a2 = inp[0], int(inp[1])
inp = input().split()
b1, b2 = inp[0], int(inp[1])
inp = input().split()
c1, c2 = inp[0], int(inp[1])

# A인 사람이 두 명 이상일 때 위급상황 E 그렇지 않으면 N
if a1 == 'Y' and a2 >= 37:
    if (b1 == 'Y' and b2 >= 37) or (c1 == 'Y' and c2 >= 37):
        print('E')
    else:
        print('N')
else:
    if (b1 == 'Y' and b2 >= 37) and (c1 == 'Y' and c2 >= 37):
        print('E')
    else:
        print('N')