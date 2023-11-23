n, m = map(int, input().split())
bag = [i+1 for i in range(n)]

for _ in range(m):
    i, j = map(int, input().split())
    bag[i-1], bag[j-1] = bag[j-1], bag[i-1]
print(*bag)