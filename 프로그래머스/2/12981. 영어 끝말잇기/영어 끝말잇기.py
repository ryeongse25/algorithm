def solution(n, words):
    answer = [0, 0]
    previous = words[0]

    for i in range(1, len(words)):
        if words[i][0] != previous[-1] or words[i] in words[:i]:
            answer = [i % n + 1, i // n + 1]
            break
        previous = words[i]

    return answer