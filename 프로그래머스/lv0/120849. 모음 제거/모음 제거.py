def solution(my_string):
    l = ['a', 'e', 'i', 'o', 'u']
    return ''.join([i for i in my_string if i not in l])