n = int(input())
count = 0
while True:
    if n == 1:
        break

    if n % 2 == 1:
        n = 3*n+1
    else:
        n=n//2
    count+=1
        
print(count)