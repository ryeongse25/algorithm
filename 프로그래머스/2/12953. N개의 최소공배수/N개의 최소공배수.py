def solution(arr):
    maximum = max(arr)
    
    i = 1
    while 1:
        lcm = True
        for num in arr:
            if (maximum * i) % num != 0:
                lcm = False
        if lcm:
            return maximum * i
        i += 1