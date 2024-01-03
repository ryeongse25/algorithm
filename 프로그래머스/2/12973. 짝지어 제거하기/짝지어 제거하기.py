def solution(s):
    stack = []
    stack.append(s[0])
    s = s[1:]
    
    for i in s:
        stack.append(i)
        if len(stack) > 1 and stack[-1] == stack[-2]:
            stack.pop()
            stack.pop()

    return 0 if stack else 1