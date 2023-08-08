def solution(arr, queries):
    answer = []
    
    for s, e, k in queries:
        tmp = []
        for i in range(s, e+1):
            if arr[i] > k:
                tmp.append(arr[i])
        answer.append(-1 if not tmp else min(tmp))
                
    return answer