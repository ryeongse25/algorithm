def solution(pb):
    pb.sort()
    
    for i in range(1, len(pb)):
        if pb[i].startswith(pb[i - 1]):
                return False
    
    return True