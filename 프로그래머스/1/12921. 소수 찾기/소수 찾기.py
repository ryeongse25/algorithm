def solution(n):
    prime = [False, False] + [True] * (n - 1)
    end = int(n ** 0.5)
    
    for i in range(2, end + 1):
        if prime[i]:
            for j in range(i * 2, n + 1, i):
                prime[j] = False
                
    return len([i for i in prime if i])