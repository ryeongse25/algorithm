n, k = map(int, input().split())
factors = [1, n]

for i in range(2, n):
    if n % i == 0:
        factors.append(i)

factors.sort()

if len(factors) >= k:
    print(factors[k - 1])
else:
    print(0)