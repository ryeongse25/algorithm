m, n = map(int, input().split())
prime = [False, False] + [True] * (n - 1)
end = int(n ** 0.5)

for i in range(2, end + 1):
    if prime[i]:
        for j in range(i * 2, n + 1, i):
            prime[j] = False

for i in range(m, n+1):
    if prime[i]:
        print(i)