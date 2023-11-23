n, m = map(int, input().split())
bag = [0 for _ in range(n)]

for _ in range(m):
    i, j, k = map(int, input().split())
    bag[i-1:j] = [k for _ in range(j-i+1)]
print(*bag)