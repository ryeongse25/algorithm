def solution(a, b, n):
    answer = 0
    
    while n >= a:
        free = (n // a) * b
        n = (n % a) + free
        answer += free
    
    return answer