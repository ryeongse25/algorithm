words = []
max_length = 0
answer = ''

for _ in range(5):
    s = input()
    words.append(s)
    max_length = max(max_length, len(s))

for i in range(max_length):
    for word in words:
        if len(word) > i:
            answer += word[i]

print(answer)