n = int(input())
name = set()
name.add('ChongChong')

for _ in range(n):
    a, b = input().split()
    if a in name or b in name:
        name.add(a)
        name.add(b)

print(len(name))