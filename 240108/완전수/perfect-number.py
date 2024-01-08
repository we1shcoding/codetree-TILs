n, k=input().split()

n=int(n)

k=int(k)

a=0

sum=0

for i in range(n,k+1):
    for j in range(1,i):
        if i%j==0:
            a+=j
    if i==a:
        sum+=1
print(sum)