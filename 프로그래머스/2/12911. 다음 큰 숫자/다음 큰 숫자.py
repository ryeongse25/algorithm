def solution(n):
    cnt = bin(n).count('1')
    
    i = n + 1
    while 1:
        if cnt == bin(i).count('1'):
            return i
        i += 1
        