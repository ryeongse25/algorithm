def solution(num, total):
    d = 0
    
    for i in range(1, num):
        d += i
    
    first_num = (total - d) // num
    answer = []
    
    for i in range(first_num, first_num + num):
        answer.append(i)
    
    return answer