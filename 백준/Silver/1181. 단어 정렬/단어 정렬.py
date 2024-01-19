n = int(input())
words = []

for _ in range(n):
    s = input()
    if [len(s), s] not in words:
        words.append([len(s), s])

for word in sorted(words, key=lambda x: (x[0], x[1])):
    print(word[1])