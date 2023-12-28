def solution(s, n):
    answer = ''
    
    for i in s:
        new_ascii = ord(i) + n
        
        if i == ' ':
            answer += ' '
        elif i.isupper():
            if new_ascii > 90:
                answer += chr(new_ascii - 26)
            else:
                answer += chr(new_ascii)
        else:
            if new_ascii > 122:
                answer += chr(new_ascii - 26)
            else:
                answer += chr(new_ascii)
            
    return answer