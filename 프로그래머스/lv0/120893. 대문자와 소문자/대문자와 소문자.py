def solution(my_string):
    answer = ''
    for letter in my_string:
        if letter.isupper():
            letter = letter.lower()
        else:
            letter = letter.upper()
        answer += letter
    return answer