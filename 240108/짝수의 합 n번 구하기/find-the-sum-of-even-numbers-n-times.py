# 테스트케이스의 수 입력
n = int(input())

# 각 테스트케이스에 대한 반복
for _ in range(n):
    # 두 정수 a, b 입력
    a, b = map(int, input().split())

    # a부터 b까지의 짝수의 합 계산
    result = sum(x for x in range(a, b+1) if x % 2 == 0)

    # 결과 출력
    print(result)