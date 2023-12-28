a, b = map(int, input().split())
print('0.',end='')
for _ in range(20) :
   a %= b
   a *= 10
   print(a//b,end='')