def solution(a, d, included):
    answer = 0
    
    for i, val in enumerate(included):
        if val:
            answer += d * i + a
    
    return answer
        