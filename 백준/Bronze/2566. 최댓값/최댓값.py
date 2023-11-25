answer = 0
x, y = 0, 0

for i in range(9):
    numbers = list(map(int, input().split()))
    tmp = max(numbers)
    if tmp > answer:
        answer = tmp
        x = i
        y = numbers.index(answer)

print(answer)
print(x + 1, y + 1)