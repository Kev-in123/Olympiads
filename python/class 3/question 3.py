num_1=float(input("Enter the first number: "))
num_2=float(input("Enter the second number: "))
print(f"{num_1} divided by {num_2} is {num_1/num_2}")
print(f"{num_1} goes into {num_2} ... {num_1//num_2} times, with a remainder of {num_1%num_2}")




#alternatively you could do 
print(f"{(num_1:=float(input('Enter the first number: ')))} divided by {(num_2:=float(input('Enter the second number: ')))} is {num_1/num_2}\n{num_1} goes into {num_2} ... {num_1//num_2} times, with a remainder of {num_1%num_2}")