t = int(input())

def is_prime(n):
    if n == 0 or n == 1:
        return 0
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return 0
    return 1

for _ in range(t):
    n = int(input())
    
    i = n
    while 1:
        if is_prime(i) == 1:
            print(i)
            break
        i += 1