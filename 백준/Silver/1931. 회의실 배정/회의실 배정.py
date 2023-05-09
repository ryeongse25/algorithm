N = int(input())
schedules = []
answer, time = 0, 0

for i in range(N):
  start, end = map(int, input().split())
  schedules.append([start, end])

schedules.sort(key=lambda x:x[0])
schedules.sort(key=lambda x:x[1])

for schedule in schedules:
  if schedule[0] >= time:
    time = schedule[1]
    answer += 1

print(answer)