def solution(s):
    l = s.split()
    for i in range(len(l)):
        if l[i] == 'Z':
            l[i] = int(l[i-1]) * -1
    return sum(map(int, l))