from collections import deque

n = int(input())
paper = list(map(int, input().split()))
result = []

d = deque()
for i in range(1, n + 1):
    d.append(i)

i = 1
while d:
    if i > 0:
        for _ in range(i - 1):
            d.append(d[0])
            d.popleft()
        i = paper[d[0] - 1]
        result.append(d[0])
        d.popleft()
    else:
        for _ in range(abs(i) - 1):
            d.appendleft(d[-1])
            d.pop()
        i = paper[d[-1] - 1]
        result.append(d[-1])
        d.pop()

print(*result)