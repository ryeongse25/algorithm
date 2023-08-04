def solution(myString, pat):
    str = ''
    for c in myString:
        if c == 'A':
            str += 'B'
        else:
            str += 'A'
    return int(pat in str)