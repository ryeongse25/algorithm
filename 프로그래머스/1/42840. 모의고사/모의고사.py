def solution(answers):
    a1 = [1, 2, 3, 4, 5]
    a2 = [2, 1, 2, 3, 2, 4, 2, 5]
    a3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    sol = [0, 0, 0]
    
    for i, num in enumerate(answers):
        if a1[i % 5] == num:
            sol[0] += 1
        if a2[i % 8] == num:
            sol[1] += 1
        if a3[i % 10] == num:
            sol[2] += 1
    
    return [i + 1 for i in range(len(sol)) if sol[i] == max(sol)]