def solution(n):
    pizza = 1
    
    while 1:
        if (pizza * 6) % n == 0:
            return pizza
        pizza += 1
        