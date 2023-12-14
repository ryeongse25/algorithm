import sys

n = int(input())
stack = []

for _ in range(n):
    s = list(map(int, sys.stdin.readline().split()))

    if s[0] == 1:
        stack.append(s[1])
    elif s[0] == 2:
        if stack:
            print(stack.pop())
        else:
            print(-1)
    elif s[0] == 3:
        print(len(stack))
    elif s[0] == 4:
        if stack:
            print(0)
        else:
            print(1)
    else:
        if stack:
            print(stack[-1])
        else:
            print(-1)