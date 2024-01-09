def solution(progresses, speeds):
    t = []
    answer = []
    
    for i, j in zip(progresses, speeds):
        if (100 - i) / j == (100 - i) // j:
            t.append((100 - i) // j)
        else:
            t.append((100 - i) // j + 1)

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