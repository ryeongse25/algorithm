import sys
import heapq

n = int(input())
heap = []

for _ in range(n):
    num = int(sys.stdin.readline())

    if num == 0:
        print(heapq.heappop(heap)) if len(heap) > 0 else print(0)
    else:
        heapq.heappush(heap, num)