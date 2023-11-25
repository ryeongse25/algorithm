n, m = map(int, input().split())
answer = [[0 for _ in range(m)] for _ in range(n)]

for i in range(n):
    row = list(map(int, input().split()))
    for index, val in enumerate(row):
        answer[i][index] += val

for i in range(n):
    row = list(map(int, input().split()))
    for index, val in enumerate(row):
        answer[i][index] += val

for i in range(n):
    print(*answer[i])