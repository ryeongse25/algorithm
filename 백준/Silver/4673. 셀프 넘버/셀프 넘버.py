self_number = [True] * 10001

for i in range(1, 10000):
    if i + sum(map(int, str(i))) < 10001:
        self_number[i + sum(map(int, str(i)))] = False

for i in range(1, 10001):
    if self_number[i]:
        print(i)