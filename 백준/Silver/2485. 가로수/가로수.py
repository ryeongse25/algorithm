def gcd_f(a, b):
    if b == 0:
        return a
    return gcd_f(b, a % b)

t = int(input())  # 심어져 있는 가로수 수
a = int(input())  # 첫 번째 가로수 위치

numbers = []  # 가로수 사이 거리
answer = 0

for _ in range(t - 1):
    num = int(input())
    numbers.append(num - a)
    a = num

gcd = numbers[0]
for i in range(1, len(numbers)):
    gcd = gcd_f(gcd, numbers[i])

for i in numbers:
    answer += i // gcd - 1

print(answer)