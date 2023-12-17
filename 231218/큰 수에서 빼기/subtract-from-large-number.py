a, b = map(int, input().split())
if a>b:
    large = a
    small = b
else:
    large = b
    small =a

c = large-small
print(c)