t = int(input())
time = [300, 60, 10]
answer = []

for i in time:
    answer.append(t // i)
    t %= i

if t != 0:
    print(-1)
else:
    print(*answer)