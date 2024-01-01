# 변수 선언 및 입력
satisfied = True
	
for _ in range(5):
    # 모든 수가 3의 배수인지 확인합니다.
    a = int(input())
    if a % 3 != 0:
        satisfied = False

#출력
if satisfied == True:
    print("1")
else:
    print("0")