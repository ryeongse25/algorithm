while 1:
    s = input()
    stack = []
    result = True

    if s == '.':
        break
    
    for i in s:
        if i == '(' or i == '[':
            stack.append(i)
        elif i == ')':
            if stack and stack[-1] == '(':
                stack.pop()
            else:
                result = False
                break
        elif i == ']':
            if stack and stack[-1] == '[':
                stack.pop()
            else:
                result = False
                break
    
    if stack or not result:
        print('no')
    else:
        print('yes')