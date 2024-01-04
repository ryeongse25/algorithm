def solution(name, yearning, photo):
    answer = []
    
    for p in photo:
        score = 0
        for i in p:
            if i in name:
                score += yearning[name.index(i)]
        answer.append(score)
    
    return answer