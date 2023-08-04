def solution(arr, n):
    if len(arr) % 2:
        return [val if i % 2 else val + n for i, val in enumerate(arr)]
    else:
        return [val + n if i % 2 else val for i, val in enumerate(arr)]