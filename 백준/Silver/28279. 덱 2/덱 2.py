import sys
from collections import deque

n = int(input())
d = deque()

for _ in range(n):
    s = list(map(int, sys.stdin.readline().split()))

    if s[0] == 1:
        d.appendleft(s[1])
    elif s[0] == 2:
        d.append(s[1])
    elif s[0] == 3:
        if d:
            print(d.popleft())
        else:
            print(-1)
    elif s[0] == 4:
        if d:
            print(d.pop())
        else:
            print(-1)
    elif s[0] == 5:
        print(len(d)) 
    elif s[0] == 6:
        if d:
            print(0)
        else:
            print(1)
    elif s[0] == 7:
        if d:
            print(d[0])
        else:
            print(-1)
    else:
        if d:
            print(d[-1])
        else:
            print(-1)