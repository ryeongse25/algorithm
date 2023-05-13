import heapq

N = int(input())
result = 0

cards = []
heapq.heapify(cards)


for i in range(N):
  num = int(input())
  heapq.heappush(cards, num)

while len(cards) > 1:
  sum = heapq.heappop(cards) + heapq.heappop(cards)
  heapq.heappush(cards, sum)
  result += sum

print(result)