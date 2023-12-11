def solution(s):
    if 'z' in s:
        s = s.replace('zero', '0')
    if 'w' in s:
        s = s.replace('two', '2')
    if 'u' in s:
        s = s.replace('four', '4')
    if 'x' in s:
        s = s.replace('six', '6')
    if 'g' in s:
        s = s.replace('eight', '8')
    if 'o' in s:
        s = s.replace('one', '1')
    if 'h' in s:
        s = s.replace('three', '3')
    if 'f' in s:
        s = s.replace('five', '5')
    if 'v' in s:
        s = s.replace('seven', '7')
    if 'n' in s:
        s = s.replace('nine', '9')

    return int(s)