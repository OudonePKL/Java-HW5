# Only integers less than or equal to 100 are input.
# Find the summation from 1 to the given number

# @author: Oudone PKL

def sumOfNum():
    num = int(input("Input: "))
    start = 1
    summation = 0

    if num <= 100:
        print("Result: ", end=' ')
        while start <= num:
            summation += start
            print(start, "+", end=' ')
            start += 1

        print(" = ", summation)

    else:
        print("Sorry, you can only enter the numbers lessthan or equal 100, Please try again!")


# Call the function
sumOfNum()