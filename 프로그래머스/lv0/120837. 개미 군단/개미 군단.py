def solution(hp):
    answer = 0
    for i in [5, 3, 1]:
        tmp, hp = divmod(hp, i)
        answer += tmp
    return answer