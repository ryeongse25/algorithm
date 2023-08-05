def solution(board, k):
    answer = 0
    
    for i, list in enumerate(board):
        for j, val in enumerate(list):
            if i + j <= k:
                answer += val
    
    return answer