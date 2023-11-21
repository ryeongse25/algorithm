def solution(my_string):
    new_string = ''
    for c in my_string:
        if not c.isdigit():
            new_string += '*'
        else:
            new_string += c
    numbers = new_string.split('*')
    numbers = [i for i in numbers if i != '']
    numbers = map(int, numbers)
    return sum(numbers)