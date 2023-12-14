n = input()
arr = list(map(int, input().split()))

cnt = 0
tmp = 0
for i in arr:
    if tmp <= i:
        cnt += 1
    tmp = i

print(cnt)