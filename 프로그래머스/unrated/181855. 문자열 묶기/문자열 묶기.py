def solution(strArr):
    group_by_length = {}
    
    for str in strArr:
        if len(str) in group_by_length:
            group_by_length[len(str)] += 1
        else:
            group_by_length[len(str)] = 1
    
    return max(group_by_length.values())