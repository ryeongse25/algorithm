def solution(array):
    numbers = [0] * (max(array) + 1)
    
    for num in array:
        numbers[num] += 1
        
    if numbers.count(max(numbers)) > 1:
        return -1
    else:
        return numbers.index(max(numbers))