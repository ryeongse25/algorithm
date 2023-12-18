from collections import deque

n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
m = int(input())
c = list(map(int, input().split()))

queue = deque()
answer = []

for i in range(n):
    if a[i] == 0:
        queue.append(b[i])

for i in c:
    queue.appendleft(i)
    answer.append(queue[-1])
    queue.pop()

print(*answer)