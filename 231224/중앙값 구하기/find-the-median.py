a,b,c = map(int, input().split())

if a <= b <= c or c <= b <= a:
    m = b
elif b <= a <= c or c <= a <= b:
    m = a
else:
    m = c
print(m)