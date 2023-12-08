a, b, v = map(int, input().split())
x = (v - b) / (a - b)

if int(x) == x:
    print(int(x))
else:
    print((v - b) // (a - b) + 1)