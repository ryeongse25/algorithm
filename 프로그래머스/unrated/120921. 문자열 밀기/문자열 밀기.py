def solution(A, B):
    if A == B:
        return 0
    
    words = []
    
    for i in range(len(A)):
        words.append(A[i:] + A[:i])
        
    words.reverse()
    
    return words.index(B) + 1 if B in words else -1