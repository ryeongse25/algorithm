def solution(n):
    answer = []
    for i in range(n):
        tmp = []
        for j in range(n):
            tmp.append(1) if i == j else tmp.append(0)
        answer.append(tmp)
    return answer