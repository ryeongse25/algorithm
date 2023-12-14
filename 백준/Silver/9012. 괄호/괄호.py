n = int(input())

for _ in range(n):
    stack = []
    s = input()
    flag = False

    for i in s:
        if i == '(':
            stack.append('(')
        else:
            if stack:
                stack.pop()
            else:
                flag = True
                break
    if stack or flag:
        print('NO')
    else:
        print('YES')