h, m = map(int, input().split(":"))

h += 1
if h == 24:
    h = 0
print(f"{h}:{m}")