from math import pow

def solution(arr):
    powers = [2 ** i for i in range(0, 11)]
    
    for i in powers:
        if len(arr) <= i:
            return arr + [0] * (i - len(arr))