n = int(input())
scores = list(map(int, input().split()))

sum = 0
max_score = max(scores)
for i in range(len(scores)):
    scores[i] = scores[i] / max_score * 100
    sum += scores[i]

print(sum / n)