n, b = map(int, input().split())
answer = []

while 1:
    answer.append(n % b)
    n //= b

    if n == 0:
        break

for i in answer[::-1]:
    if i > 9:
        print(chr(i + 55), end='')
    else:
        print(i, end='')