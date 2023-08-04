def solution(n, control):
    dict = {'w': 1, 's': -1, 'd': 10, 'a': -10}
    for c in control:
        n += dict[c]
    return n