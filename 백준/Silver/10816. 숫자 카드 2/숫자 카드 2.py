n = int(input())
cards = list(map(int, input().split()))

m = int(input())
q = list(map(int, input().split()))

dict = {}

for card in cards:
    if card in dict:
        dict[card] += 1
    else:
        dict[card] = 1

for i in q:
    if i in dict:
        print(dict[i], end=' ')
    else:
        print(0, end=' ')