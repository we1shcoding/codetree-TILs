def print_square(n, k):
    for i in range(1, n + 1):
        if k == 1:
            # 각 줄마다 줄의 번호를 출력
            print(" ".join(str(i) for _ in range(n)))
        elif k == 2:
            # 홀수번째 줄은 증가, 짝수번째 줄은 감소하게 출력
            if i % 2 == 1:
                print(" ".join(str(j) for j in range(1, n + 1)))
            else:
                print(" ".join(str(j) for j in range(n, 0, -1)))
        elif k == 3:
            # 각 줄마다 줄의 번호부터 배수를 출력
            print(" ".join(str(j * i) for j in range(1, n + 1)))

# 입력 받기
n, k = map(int, input().split())

# 정사각형 출력
print_square(n, k)