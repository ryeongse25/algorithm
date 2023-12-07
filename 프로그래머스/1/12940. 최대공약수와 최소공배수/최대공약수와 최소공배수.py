def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def solution(n, m):
    g = gcd(n, m)
    n //= g
    m //= g
    
    return [g, g * n * m]