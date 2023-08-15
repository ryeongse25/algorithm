def solution(balls, share):
    factorial = [1] * (balls + 1)
    
    for i in range(1, balls + 1):
        factorial[i] = factorial[i - 1] * i
        
    return factorial[balls] / (factorial[balls - share] * factorial[share])