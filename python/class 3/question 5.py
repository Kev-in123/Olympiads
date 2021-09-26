_3_digit_num = int(input("Enter a 3 digit number: "))

sum_of_digits = 0

for digit in str(_3_digit_num):
  sum_of_digits += int(digit)
  
print(sum_of_digits)



#alternatively you could do 
_3_digit_num = int(input("Enter a 3 digit number: "))
print(sum([int(_) for _ in str(_3_digit_num)]))
