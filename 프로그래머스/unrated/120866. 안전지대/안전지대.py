def solution(board):
    # 대각선 왼쪽 위, 위, 대각선 오른쪽 위, 왼, 오, 대각선 왼쪽 아래, 아래, 대각선 오른쪽 아래
    dy = [-1, -1, -1, 0, 0, 1, 1, 1]
    dx = [-1, 0, 1, -1, 1, -1, 0, 1]
    
    for i in range(len(board)):
        for j in range(len(board)):
            if board[i][j] != 1:
                for k in range(8):
                    if 0 <= i + dy[k] < len(board) and 0 <= j + dx[k] < len(board): 
                        if board[i + dy[k]][j + dx[k]] == 1:
                            board[i][j] = 'X'
                            break
    answer = 0
    for i in board:
        answer += i.count(0)
    
    return answer