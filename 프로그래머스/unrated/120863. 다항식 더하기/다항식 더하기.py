def solution(polynomial):
    li = polynomial.split(' + ')
    answer = ''
    x = 0
    c = 0
    
    for i in li:
        if 'x' in i:
            if len(i) == 1:
                x += 1
            else:
                x += int(i[:len(i) - 1])    
        else:
            c += int(i)
            
    if x == 1:
        answer += 'x'
    elif x != 0:
        answer += str(x) + 'x'

    if x != 0 and c != 0:
        answer += ' + '
        
    if c != 0:
        answer += str(c)
    
    return answer