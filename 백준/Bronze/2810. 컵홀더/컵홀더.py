n = int(input())
s = input()
seat = '*'

i = 0
while i < len(s):
    if s[i] == 'S':
        seat += 'S*'
        i += 1
    elif s[i] == 'L':
        seat += 'LL*'
        i += 2

print(min(n, seat.count('*')))