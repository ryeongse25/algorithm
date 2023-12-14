n = int(input())
arr = list(map(int, input().split()))

i = 1
cnt = 0
for num in arr:
    if num == i:
        i += 1
    else:
        cnt += 1

print(cnt)