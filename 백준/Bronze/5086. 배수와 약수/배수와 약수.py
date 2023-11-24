while 1:
    num1, num2 = map(int, input().split())

    if num1 == 0 and num2 == 0:
        break
    
    if int(num1/num2) == num1/num2:
        print("multiple")
    elif int(num2/num1) == num2/num1:
        print("factor")
    else:
        print("neither")