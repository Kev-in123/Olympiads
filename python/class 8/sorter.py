def sorter(type_):
  type_.lower()
  if type_=='r':
    print("regular")
  elif type_=='l':
    print('lecturer')


def qualificationLecturer(header,qualificationCode):
  qualificationCode.upper()
  if qualificationCode == "MASTER":
    payPerHour=575
    teachingAllowance=2500
  elif qualificationCode == "BACHELOR":
    payPerHour=325
    teachingAllowance=1250
  print(header)
  print(f'Hourly pay: ${payPerHour}\nTeaching allowance: ${teachingAllowance}')
  payPerHour*=160 # question didnt specify and it is needed for part 4
  global total
  total=payPerHour+teachingAllowance
  return total

def qualificationRegular(fixedSalary,hoursWorked):
  payPerHour=fixedSalary/160
  global pay
  if hoursWorked == 160:
    pay=fixedSalary*160
  elif hoursWorked>160:
    pay = 2*(hoursWorked-160)+fixedSalary*160
  elif hoursWorked<160:
    pay=payPerHour*hoursWorked
  print(f'pay: ${pay}')
  return pay

def qualificationLecturerDeductions():
  return total

def deductions(earnings):
  incomeTax=earnings*0.25
  if earnings>499.99:
    healthSurchargeFee=33
  elif earnings<=499.99:
    healthSurchargeFee=19.20
  global deductions
  deductions=incomeTax+healthSurchargeFee
  if deductions<5000:
    deductions-=5000
  print(f'deductions: ${deductions}')

def netPay(type_):
  global netPay
  if type_ == 'l':
    netPay=total-deductions
  elif type_ == 'r':
    netPay=pay-deductions
  print(f'net pay: ${netPay}')
