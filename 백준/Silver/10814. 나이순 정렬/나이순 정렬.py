n = int(input())
names = []

for _ in range(n):
    age, name = input().split()
    names.append([int(age), name])

for age, name in sorted(names, key=lambda x : x[0]):
    print(age, name)