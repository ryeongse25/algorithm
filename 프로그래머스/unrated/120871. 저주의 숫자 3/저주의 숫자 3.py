def solution(n):
    numbers = []
    
    i = 1
    while len(numbers) < n:
        if i % 3 and '3' not in str(i):
            numbers.append(i)
        i += 1
    
    return numbers[-1]
        