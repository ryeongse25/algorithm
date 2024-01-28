def solution(number, limit, power):
    factors = [1]
    answer = 0
    
    for i in range(2, number + 1):
        tmp = 0 
        for j in range(1, int(i ** 0.5) + 1):
            if i % j == 0:
                tmp += 1
        if int(i ** 0.5) == i ** 0.5:
            tmp = tmp * 2 - 1
        else:
            tmp *= 2
        factors.append(tmp)
    
    for i in factors:
        if i > limit:
            answer += power
        else:
            answer += i

    return answer