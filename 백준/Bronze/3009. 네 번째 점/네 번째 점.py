x_pos = []
y_pos = []

for _ in range(3):
    x, y = map(int, input().split())
    if x in x_pos:
        x_pos.remove(x)
    else:
        x_pos.append(x)
    if y in y_pos:
        y_pos.remove(y)
    else:
        y_pos.append(y)

print(x_pos[0], y_pos[0])