l = list(map(int, input().split()))
total = 0

for i in l:
    total += i * i

print(total % 10)