def solution(N, stages):
    answer = {}
    
    for i in range(1, N + 1):
        unclear = stages.count(i)
        total = len([j for j in stages if j >= i])
        
        try:
            answer[i] = unclear / total
        except ZeroDivisionError:
            answer[i] = 0
        
    return sorted(answer, key = lambda x : answer[x], reverse=True)