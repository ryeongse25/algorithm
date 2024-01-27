n = int(input())
schedules = []
cnt, time = 0, 0

for _ in range(n):
    start, end = map(int, input().split())
    schedules.append([start, end])

schedules.sort(key = lambda x : (x[1], x[0]))

for start, end in schedules:
    if time <= start:
        cnt += 1
        time = end

print(cnt)