c = int(input())

for _ in range(c):
    score = list(map(int, input().split()))
    average = sum(score[1:]) / score[0]
    cnt = len([i for i in score[1:] if i > average])
    print(f'{cnt / score[0] * 100:.3f}%')