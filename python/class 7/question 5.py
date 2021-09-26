a=1
print('Miles   Kilometers')
for i in range(25):
  print(f'{a}       {a*1.61:.2f}') # I used "{a*1.61:.2f}" because some outputs will end with ".0000000000001"
  a+=1


 

#alternatively you could do 
print('Miles   Kilometers')
for i in range(1,26):
  print(f'{i}       {i*1.61:.2f}')




 