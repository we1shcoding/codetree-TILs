# 영어점수 상관X, 수학 점수가 높다면 더 높은 사람의 이름 출력
# 수학 점수가 같다면 영어 점수가 더 높은 사람의 이름을 출력

a_math, a_eng = map(int, input().split())
b_math, b_eng = map(int, input().split())

if a_math > b_math or (a_math == b_math and a_eng > b_eng):
    print('A')
else:
    print('B')