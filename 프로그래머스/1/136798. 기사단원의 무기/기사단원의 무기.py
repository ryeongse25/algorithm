def solution(number, limit, power):
    factors = []
    answer = 0
    
    for i in range(1, number + 1):
        tmp = []
        for j in range(1, int(i ** 0.5) + 1):
            if i % j == 0:
                tmp.append(j)
                tmp.append(i // j)
        factors.append(len(set(tmp)))
    
    for i in factors:
        if i > limit:
            answer += power
        else:
            answer += i

    return answer