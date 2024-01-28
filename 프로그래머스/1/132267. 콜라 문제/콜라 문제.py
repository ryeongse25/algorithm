def solution(a, b, n):
    free = 0
    
    while n >= a:
        free += (n // a) * b
        n = (n % a) + (n // a) * b
    
    return free