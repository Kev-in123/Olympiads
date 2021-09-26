import re 
num=float(input('Enter a number: '))
num_result = num/2
num_final = str(num_result)
num_final_result = re.search(".5$", num_final)
if num_final_result:
  print('Odd number')
else:
  print('Even number')