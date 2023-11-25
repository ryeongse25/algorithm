t = int(input())
coins = [25, 10, 5, 1]

for _ in range(t):
    get = int(input())
    answer = []

    for coin in coins:
        answer.append(get // coin)
        get = get % coin
    
    print(*answer)