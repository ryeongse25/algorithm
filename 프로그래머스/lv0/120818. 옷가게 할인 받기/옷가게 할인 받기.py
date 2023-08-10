def solution(price):
    sale = {500000: 0.8, 300000: 0.9, 100000: 0.95, 0: 1}
    
    for key, value in sale.items():
        if price >= key:
            return int(price * value)