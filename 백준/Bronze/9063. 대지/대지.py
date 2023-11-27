n = int(input())
x_pos = []
y_pos = []

if n == 1:
    print(0)
else:
    for _ in range(n):
        x, y = map(int, input().split())
        x_pos.append(x)
        y_pos.append(y)
    
    print((max(x_pos) - min(x_pos)) * (max(y_pos) - min(y_pos)))