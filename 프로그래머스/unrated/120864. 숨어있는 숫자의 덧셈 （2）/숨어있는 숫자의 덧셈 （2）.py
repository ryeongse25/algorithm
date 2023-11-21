def solution(my_string):
    new_string = ''
    for c in my_string:
        new_string += c if c.isdigit() else '*'
    numbers = new_string.split('*')
    return sum([int(i) for i in numbers if i != ''])