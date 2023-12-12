while 1:
    n = int(input())

    if n == 0:
        break

    prime = [False, False] + [True] * (2 * n - 1)
    end = int((2 * n) ** 0.5)

    for i in range(2, end + 1):
        if prime[i]:
            for j in range(i * 2, 2 * n + 1, i):
                prime[j] = False

    print(len([i for i in range(n + 1, (2 * n + 1)) if prime[i]]))