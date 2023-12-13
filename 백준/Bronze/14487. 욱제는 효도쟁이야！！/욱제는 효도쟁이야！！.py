n = int(input())
v = list(map(int, input().split()))

v.remove(max(v))

print(sum(v))