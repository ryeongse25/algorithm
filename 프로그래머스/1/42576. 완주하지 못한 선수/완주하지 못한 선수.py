def solution(participant, completion):
    d = {}
    
    for name in participant:
        if name in d:
            d[name] += 1
        else:
            d[name] = 1
    
    for name in completion:
        d[name] -= 1
        
    return [i for i in d if d[i] == 1][0]