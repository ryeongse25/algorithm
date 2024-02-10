n = int(input())
ans = n
cnt = 0

while 1:
    x, y = divmod(n, 10)
    new = (y * 10) + (x + y) % 10
    cnt += 1
    if new == ans:
        break
    n = new

print(cnt)