a, b = map(int, input().split())
c, d = map(int, input().split())

def f_gcd(a, b):
    if b == 0:
        return a
    return f_gcd(b, a % b)

n = d * a + c * b
d = b * d

print(n // f_gcd(n, d), d // f_gcd(n, d))