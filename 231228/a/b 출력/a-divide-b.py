a, b = map(int, input().split())
print(f"{a//b}.", end="")
# a를 b로 나눈 나머지를 시작으로
# 소수점 자리를 하나씩 계산합니다.
a %= b
for _ in range(20):
    # 나머지에 10 곱한 값을 기준으로
    # b로 나누었을 떄의 몫을 구해줍니다.
    a *= 10
    print(a // b, end="")
    # a를 b로 나눈 나머지를 게속 갱신해줍니다.
    a %= b