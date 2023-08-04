def solution(n):
    answer = [n]
    
    while(1):
        n = 3 * n + 1 if n % 2 else n//2
        answer.append(n)
        if n == 1:
            break
        
    return answer