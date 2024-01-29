def solution(n, m, section):
    painted = [True] * (n + 1)
    cnt = 0
    
    for i in section:
        painted[i] = False
    
    for i, v in enumerate(painted):
        if v == False:
            painted[i:i+m] = [True] * m
            cnt += 1
    
    return cnt