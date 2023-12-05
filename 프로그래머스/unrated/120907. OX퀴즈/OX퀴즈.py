def solution(quiz):
    result = []
    
    for q in quiz:
        if eval(q.replace('=', '==')):
            result.append('O')
        else:
            result.append('X')
    
    return result