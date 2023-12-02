n = int(input())
numbers = []

for _ in range(n):
    num = int(input())
    numbers.append(num)

for i in sorted(numbers):
    print(i)