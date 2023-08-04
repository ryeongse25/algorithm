def solution(myString):
    str = ''
    
    for c in myString:
        if c < 'l':
            str += 'l'
        else:
            str += c
    
    return str