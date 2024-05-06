from itertools import permutations

def solution(numbers):
    num_list = [n for n in numbers]
    
    perm = set()
    for i in range(1, len(numbers) + 1):
        tmp = permutations(num_list, i)
        
        for j in tmp:
            j = int(''.join(j))
            if not (j == 0 or j == 1):
                perm.add(j)
    
    answer = 0
    for i in perm:
        flag = True
        for j in range(2, i):
            if i % j == 0:
                flag = False
                break
        if flag:
            answer += 1
        
    return answer