def solution(absolutes, signs):
    return sum([num if signs[i] else -num for i, num in enumerate(absolutes)])