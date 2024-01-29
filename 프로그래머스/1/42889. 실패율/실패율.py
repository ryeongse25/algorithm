def solution(N, stages):
    tmp = []
    answer = []
    
    for i in range(1, N + 1):
        unclear = stages.count(i)
        total = len([j for j in stages if j >= i])
        try:
            tmp.append([i, unclear / total])
        except ZeroDivisionError:
            tmp.append([i, 0])
    
    for i in sorted(tmp, key = lambda x : (-x[1], x[0])):
        answer.append(i[0])
        
    return answer