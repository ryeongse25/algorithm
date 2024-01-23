n = int(input())
bag_5 = n // 5

while 1:

    if bag_5 < 0:
        print(-1)
        break

    if (n - (5 * bag_5)) % 3 == 0:
        bag_3 = (n - (5 * bag_5)) // 3
        print(bag_3 + bag_5)
        break
    
    bag_5 -= 1