n = int(input())
cnt = 0
title = 666

while 1:
    if '666' in str(title):
        cnt += 1
    
    if n == cnt:
        print(title)
        break
    
    title += 1