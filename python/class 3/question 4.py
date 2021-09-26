toonies_amount=int(input("How many toonies do you have? "))
loonies_amount=int(input("How many loonies do you have? "))
quarters_amount=int(input("How many quaters do you have? "))
dimes_amount=int(input("How many dimes do you have? "))
nickles_amount=int(input("How many nickles do you have? "))

toonies = 2*toonies_amount
loonies = 1*loonies_amount
quarters = 0.25*quarters_amount
dimes = 0.1*dimes_amount
nickles = 0.05*nickles_amount

total_cents=(quarters+dimes+nickles)
total_dollars=toonies+loonies
total=total_cents+total_dollars

rounding_total = f'{total:.2f}'

print(f"The total value of your coins comes out to: ${rounding_total}")