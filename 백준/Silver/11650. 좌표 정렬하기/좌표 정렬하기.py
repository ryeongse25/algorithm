import sys
input = sys.stdin.readline

n = int(input())
pos = []

for _ in range(n):
    x, y = map(int, input().split())
    pos.append([x, y])

for i, j in sorted(pos, key = lambda x: (x[0], x[1])):
    print(i, j)