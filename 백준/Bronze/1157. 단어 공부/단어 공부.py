s = input().upper()
letters = [0 for _ in range(26)]

for i in s:
    letters[ord(i)-65] += 1

if letters.count(max(letters)) > 1:
    print('?')
else:
    print(chr(letters.index(max(letters)) + 65))