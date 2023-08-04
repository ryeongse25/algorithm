def solution(num_list):
    multiple = 1
    
    for num in num_list:
        multiple *= num
        
    return sum(num_list) if len(num_list) > 10 else multiple