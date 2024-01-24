n = 1000000
t = int(input())
prime = [False, False] + [True] * (n - 1)

# 에라토스테네스의 체
for i in range(2, int(n ** 0.5) + 1):
    if prime[i]:
        for j in range(i * 2, n + 1, i):
            prime[j] = False

for _ in range(t):
    answer = 0
    num = int(input())
    for i in range(2, num // 2 + 1):
        if prime[i] and prime[num - i]:
            answer += 1
    print(answer)