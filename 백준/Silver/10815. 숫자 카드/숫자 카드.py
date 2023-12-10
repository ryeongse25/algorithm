n = int(input())
have = list(map(int, input().split()))
m = int(input())
cards = list(map(int, input().split()))

dict = {}

for card in have:
    dict[card] = 1

for card in cards:
    if card in dict:
        print(1, end=' ')
    else:
        print(0, end=' ')