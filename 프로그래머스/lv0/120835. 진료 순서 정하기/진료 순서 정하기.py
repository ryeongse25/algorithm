def solution(emergency):
    tmp = sorted(emergency, reverse = True)
    return [tmp.index(i) + 1 for i in emergency]