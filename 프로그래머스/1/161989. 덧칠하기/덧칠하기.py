def solution(n, m, section):
    cnt = 1
    prev = section[0]
    
    for i in section:
        if i - prev >= m:
            prev = i
            cnt += 1
    
    return cnt