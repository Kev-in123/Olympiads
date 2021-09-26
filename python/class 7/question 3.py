num_1=float(input('Enter a number: '))
num_2=1.0
for i in range(10):
  print(f'{num_2} * {num_1} = {num_1*num_2}')
  num_2+=1









#alternatively you could do 
num_1=float(input('Enter a number: '))
[print(f'{i} * {num_1} = {num_1*i}') for i in range(1,11)]
  
