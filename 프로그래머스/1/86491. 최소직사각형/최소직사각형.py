def solution(sizes):
    for i in sizes:
        i.sort()

    w = max(sizes, key=lambda x: x[0])[0]
    h = max(sizes, key=lambda x: x[1])[1]
    
    return w * h