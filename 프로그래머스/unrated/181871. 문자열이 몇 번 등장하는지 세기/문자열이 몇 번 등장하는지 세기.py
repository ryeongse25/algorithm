def solution(myString, pat):
    answer = 0
    
    while(1):
        if myString.find(pat) != -1:
            answer += 1
            myString = myString[myString.find(pat)+1:]
        else:
            break
            
    return answer