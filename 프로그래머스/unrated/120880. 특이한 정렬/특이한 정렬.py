def solution(numlist, n):
#     answer = []
#     diff = [[] for _ in range(10001)]
    
#     for i in numlist:
#         diff[abs(n-i)].append(i)
    
#     for numbers in diff:
#         numbers.sort(reverse=True)
#         answer += numbers
    
#     return answer
    return sorted(numlist, key=lambda x:(abs(n-x), n-x))
    
    