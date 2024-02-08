def solution(phone_book):
    phone = {i: 1 for i in phone_book}
    
    for num in phone_book:
        tmp = ''
        for c in num:
            tmp += c
            if tmp in phone and tmp != num:
                return False

    return True