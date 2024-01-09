from math import ceil

def solution(progresses, speeds):
    t = []
    answer = []
    
    for i, j in zip(progresses, speeds):
        t.append(ceil((100 - i) / j))

    cnt = 1
    day = t[0]
    for i in range(1, len(t)):
        if t[i] <= day:
            cnt += 1
        else:
            answer.append(cnt)
            cnt = 1
            day = t[i]
    else:
        answer.append(cnt)
            
    return answer