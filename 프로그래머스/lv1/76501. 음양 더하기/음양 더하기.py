def solution(absolutes, signs):
    answer = []
    for i, num in enumerate(absolutes):
        num = num if signs[i] else -num
        answer.append(num)
    return sum(answer)