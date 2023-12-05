def solution(A, B):
    words = []
    
    for i in range(len(B)):
        words.append(B[i:] + B[:i])
    
    return words.index(A) if A in words else -1