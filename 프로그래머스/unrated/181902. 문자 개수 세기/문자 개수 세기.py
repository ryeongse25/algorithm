def solution(my_string):
    answer = [0] * 52
    
    for c in my_string:
        if c.isupper():
            answer[ord(c) - 65] += 1
        else:
            answer[ord(c) - 97 + 26] += 1
    
    return answer