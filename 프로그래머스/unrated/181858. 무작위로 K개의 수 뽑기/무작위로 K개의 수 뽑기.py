def solution(arr, k):
    answer = []
    for elem in arr:
        if elem not in answer:
            answer.append(elem)
    if len(answer) >= k:
        answer = answer[:k]
    else:
        while len(answer) < k:
            answer.append(-1)
    return answer