def solution(order):
    answer = 0
    
    for coffee in order:
        if 'cafelatte' in coffee:
            answer += 5000
        else:
            answer += 4500
        
    return answer