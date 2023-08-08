def solution(arr):
    iterates = [arr]
    
    while(1):
        tmp = []
        for i in range(len(arr)):
            if iterates[-1][i] >= 50 and iterates[-1][i] % 2 == 0:
                tmp.append(iterates[-1][i] // 2)
            elif iterates[-1][i] < 50 and iterates[-1][i] % 2:
                tmp.append(iterates[-1][i] * 2 + 1)
            else:
                tmp.append(iterates[-1][i])
        iterates.append(tmp)
        
        if iterates[-1] == iterates[-2]:
            return len(iterates) - 2