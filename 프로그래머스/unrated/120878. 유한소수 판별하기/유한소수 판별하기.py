def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def solution(a, b):
    n = gcd(a, b)
    b //= n
    
    while b % 2 == 0:
        b //= 2
    while b % 5 == 0:
        b //= 5
    
    return 1 if b == 1 else 2