age=int(input("Please enter your age: "))
if age <= 18:
  print('You are too young to go beyond this point.')
elif age>18:
  print('You have been granted access.')






#alternatively you could do 
print('You are too young to go beyond this point.' if (age:=int(input("Please enter your age: "))) <= 18 else "You have been granted access.")