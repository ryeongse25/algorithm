def solution(n):
    answer = 0
    
    for i in range(4, n+1):
        flag = False
        
        for j in range(2, i):
            if i % j == 0:
                flag = True
                
        if flag:
            answer += 1
            
    return answer