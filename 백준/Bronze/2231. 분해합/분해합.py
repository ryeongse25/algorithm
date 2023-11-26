n = int(input())
answer = 0

for i in range(n):
    total = sum(map(int, str(i)))
    total += i
    if total == n:
        answer = i
        break

print(answer)