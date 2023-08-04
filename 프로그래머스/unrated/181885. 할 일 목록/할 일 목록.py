def solution(todo_list, finished):
    answer = []
    
    for i in zip(todo_list, finished):
        if i[1] == False:
            answer.append(i[0])
    
    return answer