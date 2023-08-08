def solution(l, r):
    zero_or_five = ['0', '5']
    answer = []
    
    for i in range(l, r + 1):
        flag = True
        for j in str(i):
            if j not in zero_or_five:
                flag = False
        if flag:
            answer.append(i)
            
    return answer if answer else [-1]