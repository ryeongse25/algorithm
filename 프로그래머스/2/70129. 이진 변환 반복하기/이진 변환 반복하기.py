def solution(s):
    iteration, cnt = 0, 0
    
    while s != '1':
        cnt += s.count('0')
        s = s.replace('0', '')
        s = bin(len(s))[2:]
        iteration += 1
    return [iteration, cnt]