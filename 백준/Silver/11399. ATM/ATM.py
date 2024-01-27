n = int(input())
p = sorted((map(int, input().split())))
prefix_sum = [p[0]]

for i in range(1, len(p)):
    prefix_sum.append(prefix_sum[i - 1] + p[i])

print(sum(prefix_sum))