def factors(number):
    count = 0
    for i in range(1, number + 1):
        if number % i == 0:
            count += 1
    return 0 if count % 2 else 1

def solution(left, right):
    answer = 0
    for i in range(left, right + 1):
        if factors(i):
            answer += i
        else:
            answer -= i
    return answer