import sys
input = sys.stdin.readline

n, m = map(int, input().split())
data = list(map(int, input().split()))
p = [0]

for i in data:
    p.append(p[-1] + i)

for _ in range(m):
    i, j = map(int, input().split())
    print(p[j] - p[i - 1])