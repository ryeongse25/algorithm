import sys

n, m = map(int, input().split())
words = {}

for _ in range(n):
    s = sys.stdin.readline().rstrip()

    if len(s) >= m:
        if s in words:
            words[s][0] += 1
        else:
            words[s] = [1, len(s), s]

words = sorted(words.items(), key = lambda x : (-x[1][0], -x[1][1], x[1][2]))

for i in words:
    print(i[0])  # key 출력