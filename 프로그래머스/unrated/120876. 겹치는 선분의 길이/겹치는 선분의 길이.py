def solution(lines):
    max_num = -100
    min_num = 100
    answer = 0
    
    for a, b in lines:
        max_num = max(max_num, a, b)
    
    for a, b in lines:
        min_num = min(min_num, a, b)
    
    for i in range(min_num, max_num):
        count = 0
        for j, k in lines:
            if j <= i < k:
                count += 1
        if count >= 2:
            answer += 1
        
    return answer