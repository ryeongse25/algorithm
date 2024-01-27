n, k = map(int, input().split())
a = sorted([int(input()) for _ in range(n)], reverse = True)
answer = 0

for i in a:
    answer += k // i
    k %= i

print(answer)