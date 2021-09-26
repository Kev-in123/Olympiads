import sorter

# part 1
sort=str(input("Enter 'l' if you are a lecture or 'r' if you're a regular worker. "))
sorter.sorter(sort)

# part 2
if sort=='l':
  qualification_code=str(input("Enter 'MASTER' if you have a masters degree or 'BACHLEOR' if you have a bachelors degree. "))
  sorter.qualificationLecturer(qualification_code,qualification_code)

# part 3
if sort == 'r':
  fixed_salary=float(input("Enter your fixed salary: "))
  hours_worked=float(input("Enter the amount of hours that you worked: "))
  sorter.qualificationRegular(fixed_salary,hours_worked)

# part 4
if sort == 'r':
  sorter.deductions(fixed_salary+hours_worked)
if sort == 'l':
  sorter.deductions(sorter.qualificationLecturerDeductions())

# part 5  
sorter.netPay(type_=str(sort))

# part 6