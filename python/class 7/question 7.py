list = [float(input('Enter a number: ')) for i in range(6)]
oddNumbers=[] 
odd_product = 0

for i in list:
  if(i % 2 == 1):
    odd_product+= i
    oddNumbers.append(odd_product)

print(odd_product/len(oddNumbers))









#alternatively you could do 
list = [float(input('Enter a number: ')) for i in range(6)]
oddNumbers=[i for i in list if i % 2==1]
print(sum(oddNumbers)/len(oddNumbers))