def solution(num_list, n):
    answer = []
    for i in range(0, len(num_list), n):
        tmp = []
        for j in range(n):
            tmp.append(num_list[i])
            i += 1
        answer.append(tmp)
    return answer