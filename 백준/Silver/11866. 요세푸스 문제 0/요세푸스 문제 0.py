from collections import deque

n, k = map(int, input().split())
queue = deque()
answer = []

for i in range(1, n+1):
    queue.append(i)

while queue:
    for i in range(k):
        if i == k - 1:
            answer.append(queue[0])
        else:
            queue.append(queue[0])
        queue.popleft()

if n == 1:
    print(f'<{answer[i]}>')
else:
    for i in range(n):
        if i == 0:
            print(f'<{answer[i]}, ', end='')
        elif i == n - 1:
            print(f'{answer[i]}>', end='')
        else:
            print(f'{answer[i]}, ', end='')