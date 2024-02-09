def solution(people, limit):
    people.sort(reverse = True)
    
    start = 0
    end = len(people) - 1
    while start <= end:
        if people[start] + people[end] <= limit:
            end -= 1
        start += 1    
    
    return start