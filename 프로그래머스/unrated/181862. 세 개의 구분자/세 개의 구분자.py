def solution(myStr):
    myStr = myStr.replace('a', ' ')
    myStr = myStr.replace('b', ' ')
    myStr = myStr.replace('c', ' ')
    answer = myStr.split()
    return answer if answer else ["EMPTY"]