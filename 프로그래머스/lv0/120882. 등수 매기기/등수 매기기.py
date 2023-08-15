def solution(score):
    for i in range(len(score)):
        score[i] = sum(score[i]) / 2
    rank = sorted(score, reverse = True)
    return [rank.index(i) + 1 for i in score]