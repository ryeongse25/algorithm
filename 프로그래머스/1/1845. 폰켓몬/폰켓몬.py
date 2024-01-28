def solution(nums):
    p = {}
    
    for i in nums:
        if i in p:
            p[i] += 1
        else:
            p[i] = 1
    
    return min(len(nums) // 2, len(p))