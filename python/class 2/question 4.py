name=str(input("What is your name?"))
age=int(input("What is your age?"))
print(f"{name} is {age} years old!")







#alternatively you could do 
print(f"{(name:=str(input('What is your name?')))} is {(age:=int(input('What is your age?')))} years old!")
