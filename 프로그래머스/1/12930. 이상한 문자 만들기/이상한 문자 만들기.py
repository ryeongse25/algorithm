def solution(s):
    answer = ''
    
    i = 0
    for c in s:
        if c == ' ':
            answer += ' '
            i = 0
            continue
        elif i % 2 == 0:
            answer += c.upper()
        else:
            answer += c.lower()
        i += 1
    
    return answer