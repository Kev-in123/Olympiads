import random
deck=dict()

for i in range(1,14):
  if i == 1:
    card = "A"
  elif i == 11:
    card = "J"
  elif i == 12:
    card = "Q"
  elif i == 13:
    card = "K"
  else:
    card = str(i)
  
  deck[f"Spade {card}"] = i
  deck[f"Heart {card}"] = i
  deck[f"Club {card}"] = i
  deck[f"Diamond {card}"] = i
  
def shuffle(deck):
  for i in range(7):
    pile1=dict()
    pile2=dict()
    while len(deck)>0:
      v=deck.popitem()
      if random.randint(0,1)==0:
        pile1[v[0]]=v[1]
      else:
        pile2[v[0]]=v[1]

    while len(pile1)>0:
      v=pile1.popitem()
      deck[v[0]]=v[1]

    while len(pile2)>0:
      v=pile2.popitem()
      deck[v[0]]=v[1]

  deck = deck.items()

while True:
  userInput=str(input())
  if userInput=='deal':
    shuffle(deck)
    userCards = list(deck)[:2]
    print(userCards)

  elif userInput=='draw':
    display = list(deck)[6:11]
    print(display)

  elif userInput=='show':
    dealerCards = list(deck)[3:5]
    print(dealerCards)

  elif userInput=='cheat':
    userCards = list(deck)[:3]
    print(userCards)



  elif userInput=='quit':
    exit()