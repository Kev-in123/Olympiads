from Deck import Deck
from Card import Card

d=Deck()
deck=d.cards

for i in range(7):
  d.shuffle()

card=int(input("Which card would you like to pick from a deck of 52 cards\n(state the card number example: 5 for the 5th card): "))
print(f"Your card is '{deck[card-1].getName()}'")

deck[card-1].setMarked()
for i in range(7):
  d.shuffle()

print("abracadabra")
for i in deck:
  if i.isMarked():
    i.setMarked(marked=False)
    print(f"'{i.getName()}' is your card")
  

