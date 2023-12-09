n, m = map(int, (input().split()))

strings = set()
answer = 0

for i in range(n):
    word = input()
    strings.add(word)

for i in range(m):
    word = input()
    if word in strings:
        answer += 1

print(answer)
