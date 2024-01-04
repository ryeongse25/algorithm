def solution(k, score):
    glory = []
    answer = []
    
    for i in score:
        if len(glory) < k:
            glory.append(i)
        else:
            if i > min(glory):
                glory.remove(min(glory))
                glory.append(i)
        answer.append(min(glory))
    
    return answer
        