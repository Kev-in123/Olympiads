name=str(input("What is your name?"))
print(f"Hi {name}! nice to meet you!")


#alternatively you could do 
print(f"Hi {(name:=str(input('What is your name?')))}! nice to meet you!")
