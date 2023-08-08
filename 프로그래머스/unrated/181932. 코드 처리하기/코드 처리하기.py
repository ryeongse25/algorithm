def solution(code):
    ret = ''
    mode = 0
    
    for i in range(len(code)):
        if code[i] == '1':
            mode = not mode
        else:
            if i % 2 == mode:
                ret += code[i]
                    
    return ret if ret else "EMPTY"
            