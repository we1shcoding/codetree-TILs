n = int(input())
while True:
        # 사용자로부터 자연수 입력 받기
        
        
        # 0이 입력되면 프로그램 종료
        if n == 1:
            break
        
        # 콜라츠 시퀀스 계산
        count = 0
        while n != 1:
            if n % 2 == 0:
                n = n // 2
            else:
                n = 3 * n + 1
            count += 1
        
        # 결과 출력
        print(count)