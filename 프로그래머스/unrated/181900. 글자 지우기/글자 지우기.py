def solution(my_string, indices):
    answer = ''
    
    for i, c in enumerate(my_string):
        if i in indices:
            answer += '*'
        else:
            answer += c
        
    
    return answer.replace('*', '')