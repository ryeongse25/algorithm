def solution(keyinput, board):
    pos = [0, 0]
    board = [board[0] // 2, board[1] // 2]
    
    for key in keyinput:
        if key == 'left' and abs(pos[0] - 1) <= board[0]:
            pos[0] -= 1
        elif key == 'right' and abs(pos[0] + 1) <= board[0]:
            pos[0] += 1
        elif key == 'up' and abs(pos[1] + 1) <= board[1]:
            pos[1] += 1
        elif key == 'down' and abs(pos[1] - 1) <= board[1]:
            pos[1] -= 1
            
    return pos