n = input()
a = sorted(list(map(int, input().split())))
m = input()
b = list(map(int, input().split()))

def binary_search(arr, target, start, end):
    while start <= end:
        mid = (start + end) // 2

        if arr[mid] == target:
            return 1
        elif arr[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    
    return 0

for i in b:
    print(binary_search(a, i, 0, len(a) - 1))