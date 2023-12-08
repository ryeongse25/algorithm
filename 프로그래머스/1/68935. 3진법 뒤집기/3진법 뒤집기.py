def ternary(n):
    answer = ''
    while 1:
        answer += str(n % 3)
        n //= 3
        if n == 0:
            break
    return answer[::-1]
        

def solution(n):
    num = ternary(n)
    answer = 0
    for i in range(len(num)):
        answer += (3 ** i) * int(num[i])
    return answer