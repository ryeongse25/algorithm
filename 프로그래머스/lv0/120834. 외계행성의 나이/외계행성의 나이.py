alphabets = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']

def solution(age):
    age = str(age)
    for digit in age:
        age = age.replace(digit, alphabets[int(digit)])
    return age