def factorial(n):
    if n <= 1:
        return 1
    return n * factorial(n - 1)

t = int(input())

for _ in range(t):
    n, m = map(int, input().split())
    print(factorial(m) // (factorial(n) * factorial(m - n)))