s = input()
dial = {'ABC' : 2, 'DEF' : 3, 'GHI' : 4, 'JKL' : 5, 'MNO' : 6, 'PQRS' : 7, 'TUV' : 8, 'WXYZ' : 9}

time = 0

for i in s:
    for j in dial:
        if i in j:
            time += dial[j] + 1

print(time)