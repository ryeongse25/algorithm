n, m = map(int, input().split())
numbers = [i for i in range(1, n + 1)]

for _ in range(m):
    i, j = map(int, input().split())
    tmp = numbers[i-1:j]
    tmp = tmp[::-1]
    numbers[i-1:j] = tmp

print(*numbers)