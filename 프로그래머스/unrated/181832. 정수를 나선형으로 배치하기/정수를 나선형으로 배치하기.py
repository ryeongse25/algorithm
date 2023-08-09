def solution(n):
    answer = [[0] * n for _ in range(n)]
    x, y = 0, 0
    dir = 'r'
    
    for i in range(1, n * n + 1):
        answer[x][y] = i
            
        if dir == 'r':
            if y + 1 < n and answer[x][y+1] == 0:
                y += 1
            else:
                x += 1
                dir = 'd'
        elif dir == 'd':
            if x + 1 < n and answer[x + 1][y] == 0:
                x += 1
            else:
                y -= 1
                dir = 'l'
        elif dir == 'l':
            if y - 1 > -1 and answer[x][y - 1] == 0:
                y -= 1
            else:
                x -= 1
                dir = 'u'
        else:
            if x - 1 > -1 and answer[x - 1][y] == 0:
                x -= 1
            else:
                y += 1
                dir = 'r'
                
    return answer