def solution(s):
    numbers = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
    
    for i, val in enumerate(numbers):
        s = s.replace(val, str(i))
    
    return int(s)