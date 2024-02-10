a = int(input())
b = int(input())
c = int(input())
num = [0 for _ in range(10)]

for i in str(a * b * c):
    num[int(i)] += 1

for i in num:
    print(i)