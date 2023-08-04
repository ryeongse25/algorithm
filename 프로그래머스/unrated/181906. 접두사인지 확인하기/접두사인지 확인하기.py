def solution(my_string, is_prefix):
    answer_list = []
    
    for i in range(len(my_string)):
        answer_list.append(my_string[:i])
        
    return int(is_prefix in answer_list)