i = 1
while 1:
    l, p, v = map(int, input().split())

    if l == p == v == 0:
        break
    
    result = 0
    result += (v // p * l)
    result += min(v % p, l)

    print(f'Case {i}: {result}')
    i += 1