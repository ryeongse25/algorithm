def solution(babbling):
    words = ['aya', 'ye', 'woo', 'ma']
    cnt = 0
    
    for i in words:
        for index, j in enumerate(babbling):
            if i in j:
                babbling[index] = babbling[index].replace(i, '0')
    
    for i in babbling:
        if i.isdigit():
            cnt += 1
            
    return cnt