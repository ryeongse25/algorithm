def solution(dots):
    first_line = [[1, 0], [2, 0], [3, 0]]
    second_line = [[3, 2], [3, 1], [2, 1]]
    
    for i in range(3):
        first_m = (dots[first_line[i][0]][1] - dots[first_line[i][1]][1]) / (dots[first_line[i][0]][0] - dots[first_line[i][1]][0]) 
        second_m = (dots[second_line[i][0]][1] - dots[second_line[i][1]][1]) / (dots[second_line[i][0]][0] - dots[second_line[i][1]][0]) 
        if first_m == second_m:
            return 1
    
    return 0