n = int(input())
arr = set()
cnt = 0

for _ in range(n):
    s = input()
    if s == 'ENTER':
        cnt += len(arr)
        arr.clear()
    else:
        arr.add(s)
cnt += len(arr)

print(cnt)