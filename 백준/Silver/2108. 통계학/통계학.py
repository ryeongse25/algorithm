import sys

n = int(input())
numbers = []
dict = {}

for _ in range(n):
    num = int(sys.stdin.readline())
    numbers.append(num)

    if num in dict:
        dict[num] += 1
    else:
        dict[num] = 1

numbers.sort()

max_nums = []
max_cnt = max(dict.values())
for key, value in dict.items():
    if value == max_cnt:
        max_nums.append(key)

print(round(sum(numbers)/n))
print(numbers[n//2])
if len(max_nums) > 1:
    print(sorted(max_nums)[1])
else:
    print(sorted(max_nums)[0])
print(numbers[-1] - numbers[0])