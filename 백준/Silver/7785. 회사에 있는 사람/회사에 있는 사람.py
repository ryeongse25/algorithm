n = int(input())
in_company = {}

for _ in range(n):
    name, s = input().split()

    if s == 'enter':
        in_company[name] = 1
    else:
        in_company.pop(name)

for i in sorted(in_company.keys(), reverse=True):
    print(i)