answer = 0

for _ in range(5):
    score = int(input())
    answer += max(score, 40)

print(answer // 5)