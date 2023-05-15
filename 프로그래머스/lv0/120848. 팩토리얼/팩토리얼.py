def factorial(n):
    if n == 1:
        return 1
    return n * factorial(n - 1)

def solution(n):
    
    facts = [0] * 11
    
    for i in range(1, 11):
        facts[i] = factorial(i)
        
    for i in range(10, 0, -1):
        if n >= facts[i]:
            return i