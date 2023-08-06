def solution(strArr):
    group_by_length = {}
    
    for str in strArr:
        group_by_length[len(str)] = group_by_length.get(len(str), 0) + 1
    
    return max(group_by_length.values())