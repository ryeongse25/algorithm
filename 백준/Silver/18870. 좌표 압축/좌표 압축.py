n = int(input())
numbers = list(map(int, input().split()))
ord = sorted(set(numbers))
dict = {ord[i] : i for i in range(len(ord))}

for i in numbers:
    print(dict[i], end=' ')