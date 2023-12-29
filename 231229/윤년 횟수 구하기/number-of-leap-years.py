def count_leap_years(n):
    leap_year_count = 0

    for year in range(1, n + 1):
        if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
            leap_year_count += 1

    return leap_year_count

# 입력 받기
n = int(input())

# 윤년의 개수 출력
result = count_leap_years(n)
print(result)