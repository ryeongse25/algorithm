n = int(input())
arr = list(map(int, input().split()))

k = 1
stack = []
while 1:
    if not arr and not stack:
        print('Nice')
        break
    
    if not arr and stack[-1] != k:
        print('Sad')
        break
    
    if stack and stack[-1] == k:
        stack.pop()
        k += 1
    elif arr[0] == k:
        del arr[0]
        k += 1
    else:
        stack.append(arr[0])
        del arr[0]