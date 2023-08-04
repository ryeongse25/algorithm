def solution(arr, flag):
    answer = []
    
    for i, val in enumerate(flag):
        if val:
            answer += [arr[i]] * (arr[i] * 2)
        else:
            answer = answer[:-arr[i]]
        
    return answer