arr = list(map(int, input().split()))  
start, end = arr[0], arr[1]  
cnt = 0  


for i in range(start, end + 1):  
    complete = 0  
    for j in range(1, i):  
        if i % j == 0:  
            complete += j  
    if complete == i:  
        cnt += 1  

print(cnt)