def solution(n):
    l = list(range(n + 1))
    return sum(l[1::2]) if n % 2 else sum(map(lambda x: x ** 2, l[::2]))