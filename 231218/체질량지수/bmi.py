cm, kg = map(int, input().split())
bmi = (kg * 100**2)//(cm ** 2)

    print(bmi)
if bmi>25:
    print('Obesity')