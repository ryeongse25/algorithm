def solution(n, arr1, arr2):
    b1 = []
    b2 = []
    answer = []
    
    for i in arr1:
        b1.append(bin(i)[2:].rjust(n, '0'))
    
    for i in arr2:
        b2.append(bin(i)[2:].rjust(n, '0'))
    
    for i, j in zip(b1, b2):
        s = ''
        for k in range(n):
            if int(i[k]) or int(j[k]):
                s += '#'
            else:
                s += ' '
        answer.append(s)
        
    return answer