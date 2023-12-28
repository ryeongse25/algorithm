def solution(s):
    answer = []
    
    for i, val in enumerate(s):
        l = s[:i]
        index = l.rfind(val)
        
        if index == -1:
            answer.append(-1)
        else:
            answer.append(i - index)
        
    return answer