def solution(picture, k):
    answer = []
    
    for line in picture:
        new_line = ''
        for i in line:
            new_line += i * k
        for i in range(k):
            answer.append(new_line)
            
    return answer