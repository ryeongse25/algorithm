import sys
input = sys.stdin.readline

n = int(input())
pos = []

for _ in range(n):
    x, y = map(int, input().split())
    pos.append([x, y])

for i, j in sorted(pos, key = lambda x: (x[1], x[0])):
    print(i, j)