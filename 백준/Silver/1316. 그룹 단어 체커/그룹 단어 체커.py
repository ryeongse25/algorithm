n = int(input())
count = 0

for _ in range(n):

    s = input()
    flag = True

    for i in range(len(s) - 1):
        if s[i] == s[i+1]:
            continue
        elif s[i] in s[i+2:]:
            flag = False
            break
    
    if flag:
        count += 1

print(count)