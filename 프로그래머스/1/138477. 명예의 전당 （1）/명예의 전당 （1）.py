def solution(k, score):
    glory = []
    answer = []
    
    for i in score:
        glory.append(i)
        if len(glory) > k:
            glory.remove(min(glory))
        answer.append(min(glory))
    
    return answer
        