def solution(arr):
    if 2 not in arr:
        return [-1]
    l = arr.index(2)
    r = arr[::-1].index(2)
    return arr[l:len(arr)-r]