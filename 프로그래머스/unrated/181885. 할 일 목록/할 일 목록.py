def solution(todo_list, finished):
    return [val for i, val in enumerate(todo_list) if not finished[i]]