def solution(arr, query):
    for i, val in enumerate(query):
        if i % 2:
            arr = arr[val:]
        else:
            arr = arr[:val+1]
    return arr