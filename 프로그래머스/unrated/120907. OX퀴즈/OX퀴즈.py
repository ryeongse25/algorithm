def solution(quiz):
    result = []
    
    for q in quiz:
        l = q.split('=')
        if eval(l[0]) == int(l[1]):
            result.append('O')
        else:
            result.append('X')
    
    return result