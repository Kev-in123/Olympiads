list = [float(input('Enter a number: ')) for i in range(6)]

positive_numbers=[]
negative_numbers=[]

for num in list: 
  if num > 0: 
    positive_numbers.append(list)
  elif num < 0: 
    negative_numbers.append(list)

print(len(positive_numbers), sum(negative_numbers))







#alternatively you could do 
list = [float(input('Enter a number: ')) for i in range(6)]
positive_numbers=[num for num in list if num > 0]
negative_numbers=[num for num in list if num < 0]
print(len(positive_numbers), sum(negative_numbers))
