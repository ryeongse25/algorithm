def solution(rank, attendance):
    tmp = []
    
    for i, (r, is_attended) in enumerate(zip(rank, attendance)):
        if is_attended == True:
            tmp.append([r, i])
            
    tmp = sorted(tmp)
    
    return 10000 * tmp[0][1] + 100 * tmp[1][1] + tmp[2][1]