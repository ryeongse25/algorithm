s = input()
alphabets = [-1 for _ in range(26)]

for i, letter in enumerate(s):
    if alphabets[ord(letter) - 97] == -1:
        alphabets[ord(letter) - 97] = i

print(*alphabets)