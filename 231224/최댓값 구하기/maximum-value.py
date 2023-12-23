a, b, c = map(int, input().split())

if a >= b:
    if a >= c:
        print(a)
    else:
        print(c)

# a와 b를 비교한 결과가 나와있으므로, b와 c만 비교하여 최댓값을 구합니다.
else:
    if b >= c:
        print(b)
    else:
        print(c)