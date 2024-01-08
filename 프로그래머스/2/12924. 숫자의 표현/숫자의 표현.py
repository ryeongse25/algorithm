def solution(n):
    answer = 0
    data = [i for i in range(1, n+1)]
    
    end = 0
    interval_sum = 0
    for start in range(len(data)):
        while interval_sum < n and end < len(data):
            interval_sum += data[end]
            end += 1
        if interval_sum == n:
            answer += 1
        interval_sum -= data[start]
        
    return answer