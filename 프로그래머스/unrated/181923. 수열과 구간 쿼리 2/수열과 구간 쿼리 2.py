def solution(arr, queries):
    answer = [-1] * len(queries)
    for i, (s, e, k) in enumerate(queries):
        for j in range(s, e+1):
            if arr[j] > k:
                if answer[i] == -1 or arr[j] < answer[i]:
                    answer[i] = arr[j]
                
    return answer