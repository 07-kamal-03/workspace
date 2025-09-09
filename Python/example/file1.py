def main():
    num = int(input("enter the number: "))
    print(21 % 5)
    square(num)

def square(num):
    result = num * num
    print("Result: ", result)
    return result

if __name__ == "__main__":
    main()