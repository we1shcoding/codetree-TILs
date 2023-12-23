# 첫 번째 사람 정보 입력
person1_info = input().split()
person1_age = int(person1_info[0])
person1_gender = person1_info[1]

# 두 번째 사람 정보 입력
person2_info = input().split()
person2_age = int(person2_info[0])
person2_gender = person2_info[1]

# 한 사람이라도 19세 이상이면서 남자인 경우 1을 출력, 그렇지 않으면 0을 출력
if (person1_age >= 19 and person1_gender == 'M') or (person2_age >= 19 and person2_gender == 'M'):
    print(1)
else:
    print(0)