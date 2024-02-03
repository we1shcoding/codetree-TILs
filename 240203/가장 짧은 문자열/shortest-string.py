string1 = input()
string2 = input()
string3 = input()

# 문자열들의 길이 계산
lengths = [len(string1), len(string2), len(string3)]

# 가장 긴 문자열과 가장 짧은 문자열 찾기
max_length = max(lengths)
min_length = min(lengths)

# 결과 출력
print(max_length - min_length)