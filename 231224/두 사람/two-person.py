a_age, a_sex = map(int, str, inpit().split())
b_age, b_sex = map(int, str, inpit().split())

if (a_age >= 19 and a_sex == 'M') or (b_age >=19 and b_sex == 'M'):
    print('1')
else:
    print('0')