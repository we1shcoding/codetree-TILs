n = int(input())
m = int(input())

# (a), (b), (c), (d) 계산 및 출력
a = n * (m % 10)
print(a)

b = n * ((m % 100) // 10)
print(b)

c = n * (m // 100)
print(c)

d = n * m
print(d)