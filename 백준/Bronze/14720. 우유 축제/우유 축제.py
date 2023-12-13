n = int(input())
store = list(map(int, input().split()))

cnt = 0
now = 2
for i in store:
    if now == 2 and i == 0:
        cnt += 1
        now = 0
    elif now == 0 and i == 1:
        cnt += 1
        now = 1
    elif now == 1 and i == 2:
        cnt += 1
        now = 2

print(cnt)