import re

pattern = "(\w*oe|\w*ow)"
rhymingWords = []

with open("InFlandersFields.txt", "r") as fi:
  for line in fi:
    rhymingWords.extend(re.findall(pattern, line, re.IGNORECASE))

print(rhymingWords)
print(len(rhymingWords))
