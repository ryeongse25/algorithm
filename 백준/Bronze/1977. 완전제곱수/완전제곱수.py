m = int(input())
n = int(input())

sum = 0
start = int(m ** 0.5) if int(m ** 0.5) == m ** 0.5 else int(m ** 0.5) + 1
for i in range(start, int(n ** 0.5) + 1):
    sum += i * i

if sum != 0:
    print(sum)
    print(start * start)
else:
    print(-1)