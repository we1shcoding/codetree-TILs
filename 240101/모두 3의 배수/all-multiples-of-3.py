n = int(input())
sat = True

for _ in range(5):
    if n%3==0:
        continue
    else:
        sat = False
        break
if sat == True:
    print('1')
else:
    print('0')