def solution(picture, k):
    answer = []
    
    for line in picture:
        new_line = ''
        for c in line:
            new_line += c * k
        for i in range(k):
            answer.append(new_line)
            
    return answer