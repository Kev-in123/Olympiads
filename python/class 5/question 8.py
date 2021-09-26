weight1_kg = float(input("Enter a weight in kilograms: ")) 
weight1_g = float(input("Enter a weight in grams: "))

weight2_kg = float(input("Enter a weight in kilograms: ")) 
weight2_g = float(input("Enter a weight in grams: "))


_kg = weight1_kg + weight2_kg

_g = weight1_g + weight2_g

extra_g=_g//1000

if _g>1000:
  _g-=extra_g*1000
  _kg+=extra_g

print(f'{_kg} kg {_g} g')