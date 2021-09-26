print("Welcome to the power calculator!")
base=float(input("Enter the base: "))
exponent=float(input("Enter the exponent: "))
print(f"{base} to the power of {exponent} is {base**exponent}")








#alternatively you could do 
print(f"Welcome to the power calculator!\n{(base:=float(input('Enter the base: ')))} to the power of {(exponent:=float(input('Enter the exponent: ')))} is {base**exponent}")