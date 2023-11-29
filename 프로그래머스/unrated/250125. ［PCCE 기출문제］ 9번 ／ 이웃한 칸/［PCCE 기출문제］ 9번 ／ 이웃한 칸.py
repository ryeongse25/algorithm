def solution(board, h, w):
    dh, dw = [0, 1, -1, 0], [1, 0, 0, -1]
    count = 0
    
    for i in range(4):
        h_check = h + dh[i]
        w_check = w + dw[i]
        if 0 <= h_check < len(board) and 0 <= w_check < len(board):
            if board[h][w] == board[h_check][w_check]:
                count += 1

    return count