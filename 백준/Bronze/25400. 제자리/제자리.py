n = int(input())
arr = list(map(int, input().split()))

i = 0
while 1:
    if i >= len(arr):
        break

    if arr[i] != i + 1:
        del arr[i]
        continue
    i += 1

print(n - len(arr))