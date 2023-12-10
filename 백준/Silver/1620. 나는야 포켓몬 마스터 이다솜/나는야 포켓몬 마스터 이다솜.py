import sys

n, m = map(int, input().split())
pocketmon = {}

for i in range(1, n + 1):
    name = sys.stdin.readline().strip()
    pocketmon[str(i)] = name
    pocketmon[name] = i

for i in range(m):
    s = sys.stdin.readline().strip()
    print(pocketmon[s])