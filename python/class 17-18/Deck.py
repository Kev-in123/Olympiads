import random
from Card import Card

class Deck:
    def __init__(self, n = 1):
        self.cards = []
        for num in range(n):
            for i in Card.Suits:
                for j in Card.Ranks:
                    self.cards.append(Card(i, j))

    def shuffle(self):
        pile1 = []
        pile2 = []
        while len(self.cards) > 0:
            v = self.cards.pop()
            if random.randint(0, 1) == 0:
                pile1.append(v)
            else:
                pile2.append(v)

        self.cards.extend(pile1)
        self.cards.extend(pile2)

    def print(self):
        for i in self.cards:
            print(i.getName())
