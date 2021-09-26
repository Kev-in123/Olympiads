a=1
for i in range(20):
  print(f'{a}     {a**2}     {a**3}')
  a+=1






#alternatively you could do 
[print(f'{i}\t{i**2}\t{i**3}') for i in range(1,21)]