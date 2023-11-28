n, b = input().split()
answer = 0

for i, val in enumerate(reversed(n)):
    if val.isdigit():
        answer += int(val) * (int(b) ** i)
    else:
        answer += (ord(val) - 55) * (int(b) ** i)

print(answer)