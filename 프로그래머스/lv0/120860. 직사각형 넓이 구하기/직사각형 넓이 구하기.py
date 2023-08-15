def solution(dots):
    max_x, max_y = -256, -256
    min_x, min_y = 256, 256
    
    for x, y in dots:
        max_x = max(max_x, x)
        min_x = min(min_x, x)
        max_y = max(max_y, y)
        min_y = min(min_y, y)
    
    return (max_x - min_x) * (max_y - min_y)
        