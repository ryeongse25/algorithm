def solution(n, arr1, arr2):
    answer = []
    
    for i, j in zip(arr1, arr2):
        s = bin(i | j)[2:].zfill(n)
        s = s.replace('1', '#')
        s = s.replace('0', ' ')
        answer.append(s)

    return answer