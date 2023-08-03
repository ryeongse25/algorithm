n, num = input().split()
answer = 0

for i in range(int(n)+1):
  if i < 10:
    i = '0' + str(i)
  for j in range(60):
    if j < 10:
      j = '0' + str(j)
    for k in range(60):
      if k < 10:
        k = '0' + str(k)
      if num in str(i) + str(j) + str(k):
        answer += 1

print(answer)