def solution(num):
    answer = 0
    if num == 1:
        return 0
    
    while(1):
        answer += 1
        if num % 2:
            num = num * 3 + 1
        else:
            num //= 2
        if num == 1:
            break
    
    return -1 if answer > 500 else answer
            