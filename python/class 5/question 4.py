hours_worked=int(input('Please enter the number of hours that you worked: '))
parts_cost=int(input('Please enter the cost of the parts: '))
if hours_worked==1 and parts_cost<50:
  print(f'$150')
elif hours_worked==1:
  print(f'${hours_worked*100+parts_cost}')
elif hours_worked>=2:
  print(f'${(hours_worked*100)+parts_cost}')
elif hours_worked == 0:
  print(f'$150')