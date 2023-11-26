n = int(input())
answer = 0

for i in range(n):
    s = str(i)
    total = i
    for num in s:
        total += int(num)
    if total == n:
        answer = i
    if answer != 0:
        break

print(answer)