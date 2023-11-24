while 1:
    n = int(input())
    factors = [1]

    if n == -1:
        break
    
    for i in range(2, n):
        if n % i == 0:
            factors.append(i)
    
    if n == sum(factors):
        print(f'{n} = ' + ' + '.join(map(str, factors)))

    else:
        print(f'{n} is NOT perfect.')