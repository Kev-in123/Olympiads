mark_1=float(input('Enter your first mark: '))
if mark_1>100 or mark_1<0:
  print('Invalid test score.')
  exit()
mark_2=float(input('Enter your second mark: '))
if mark_2>100 or mark_2<0:
  print('Invalid test score.')
  exit()  
mark_3=float(input('Enter your third mark: '))
if mark_3>100 or mark_3<0:
  print('Invalid test score.')
  exit()
average=(mark_1+mark_2+mark_3)/3
if average>=50:
  print('Pass')
else:
  print('Fail')