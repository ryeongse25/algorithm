def solution(strArr):
    answer = []
    return [str.upper() if i % 2 else str.lower() for i, str in enumerate(strArr)]