def solution(arr):
    n = max(len(arr), len(arr[0]))
    
    while len(arr) < n:
        arr.append([0] * n)
    
    if len(arr[0]) < n:
        for i in range(n):
            arr[i] = arr[i] + [0] * (n - len(arr[i]))
        
    return arr