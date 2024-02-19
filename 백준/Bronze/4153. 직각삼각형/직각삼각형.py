while 1:
    a, b, c = map(int, input().split())

    if a == b == c == 0:
        break
    
    numbers = sorted([a, b, c])
    
    if numbers[2] ** 2 == numbers[0] ** 2 + numbers[1] ** 2:
        print('right')
    else:
        print('wrong')