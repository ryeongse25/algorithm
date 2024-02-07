def solution(k, tangerine):
    d = {}
    cnt, tmp = 0, 0
    
    for i in tangerine:
        if i in d:
            d[i] += 1
        else:
            d[i] = 1
    
    weight = sorted([i for i in d.values()], reverse=True)
    
    for i in weight:
        if tmp < k:
            cnt += 1
            tmp += i
            continue
        break
        
    return cnt