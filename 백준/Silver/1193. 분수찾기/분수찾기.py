x = int(input())
line = 1

while line < x:
    x -= line
    line += 1

# 홀수 번째 라인일 경우
if line % 2:
    print(f'{line - x + 1}/{x}')
# 짝수 번째 라인일 경우
else:
    print(f'{x}/{line - x + 1}')