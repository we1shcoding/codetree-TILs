import sys
input = sys.stdin.readline

n = int(input())
arr = [int(num) for num in input().split()]

first_max = -sys.maxsize
second_max = -sys.maxsize
max_index = 0

for i in range(n):
    if arr[i] > first_max:
        first_max = arr[i]
        max_index = i

for j in range(n):
    if arr[j] > second_max and j != max_index:
        second_max = arr[j]

print(first_max, second_max)