n = int(input())

def is_prime(num):
    for i in range(2,num):
        if num % i == 0:
            return 0
    return 1


i = 2
while i <= n:
    if n % i == 0:
        print(i)
        n = n // i 
    else:
        i += 1