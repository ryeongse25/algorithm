def solution(t, p):
    numbers = []
    cnt = 0
    
    for i in range(len(t) - len(p) + 1):
        numbers.append(t[i:i+len(p)])
    
    for i in numbers:
        if int(i) <= int(p):
            cnt += 1

    return cnt