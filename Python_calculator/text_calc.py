import math

# Text based Calculator, Jason Bierbrauer 1-4-2017
# Updated with Error Handling on 1-14-2017

def add():
    num1 = int(input("\nPlease enter first number "))
    num2 = int(input("Please enter second number "))
    result = num1 + num2
    return result

def sub():
    num1 = int(input("\nPlease enter first number "))
    num2 = int(input("Please enter second number "))
    result = num1 - num2
    return result

def mult():
    num1 = int(input("\nPlease enter first number "))
    num2 = int(input("Please enter second number "))
    result = num1 * num2
    return result

def div():
    num1 = int(input("\nPlease enter first number "))
    num2 = int(input("Please enter second number "))
    result = num1 / num2
    return result

def square():
    num1 = int(input("\nPlease enter a number "))
    result = num1 * num1
    return result

def sqrt():
    num1 = int(input("\nPlease enter a number "))
    result = math.sqrt(num1)
    return result

def log2():
    num1 = int(input("\nPlease enter a number "))
    result = math.log2(num1)
    return result

def isTriangle():
    num1 = int(input("\nPlease enter first number "))
    num2 = int(input("Please enter second number "))
    num3 = int(input("Please enter third number "))
    tri1 = num1 + num2
    tri2 = num2 + num3
    tri3 = num1 + num3
    if num1 > tri2:
        msg1 = "Not a triangle, number one is too large."
        return msg1
    elif num2 > tri3:
        msg2 = "Not a triangle, number two is too large."
        return msg2
    elif num3 > tri1:
        msg3 = "Not a triangle, number three is too large."
        return msg3
    else:
        msg4 = "Meets criteria to be a triangle."
        return msg4

x = 0

while x != 9:
    try:
        x = int(input('''        1. Addition
        2. Subtraction
        3. Multiplication
        4. Division
        5. Square
        6. Square Root
        7. Log2
        8. isTriangle
        9. Exit
        Please enter a numerical selection: '''))

        if x == 1:
            ans = add()
        elif x == 2:
            ans = sub()
        elif x == 3:
            ans = mult()
        elif x == 4:
            ans = div()
        elif x == 5:
            ans = square()
        elif x == 6:
            ans = sqrt()
        elif x == 7:
            ans = log2()
        elif x == 8:
            ans = isTriangle()
        elif x == 9:
            break

        print("\nThe answer is:", ans, "\n")

    except ValueError:
        print("\nYou entered a non-number.\nPlease enter a number.\n")
    except ZeroDivisionError:
        print("\nYou can't divide by Zero!\n")
    except NameError:
        print()
