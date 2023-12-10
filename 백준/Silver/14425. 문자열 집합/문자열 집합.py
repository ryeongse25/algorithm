n, m = map(int, input().split())
a = set()
answer = 0

for i in range(n):
    s = input()
    a.add(s)

for i in range(m):
    s = input()
    if s in a:
        answer += 1

print(answer)