def solution(arr, k):
    answer = []
    for elem in arr:
        if elem not in answer:
            answer.append(elem)
    if len(answer) >= k:
        answer = answer[:k]
    else:
        answer = answer + [-1] * (k - len(answer))
    return answer