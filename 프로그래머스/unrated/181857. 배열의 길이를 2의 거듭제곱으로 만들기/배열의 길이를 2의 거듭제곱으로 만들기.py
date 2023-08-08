from math import pow

def solution(arr):
    powers = [1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]
    
    for i in powers:
        if len(arr) <= i:
            return arr + [0] * (i - len(arr))