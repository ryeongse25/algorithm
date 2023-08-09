def solution(rank, attendance):
    tmp = []
    
    for r, is_attended in zip(rank, attendance):
        if is_attended == True:
            tmp.append(r)
            
    tmp = sorted(tmp)
    a = rank.index(tmp[0])
    b = rank.index(tmp[1])
    c = rank.index(tmp[2])
    
    return 10000 * a + 100 * b + c