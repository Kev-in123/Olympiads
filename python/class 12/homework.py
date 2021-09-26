import re
phoneBook={}
while 1:
  cmd=input('>')
  if cmd.lower()[:3]=='add':
    result = re.search(' (.*) ', cmd)
    a=len(result.group(1))+4
    number=cmd[4:a]
    name=cmd[a+1:]
    phoneBook[number]=name
    if name in phoneBook:
      print(f'phone number updated for {name}')
    else:
      print(f'phone number added for {name}')
  
  elif cmd.lower()[:6]=='lookup':
    try:
      name=cmd[7:]
      print(phoneBook[name])
    
    except:
      print('Phone number not found.')

  elif cmd.lower()[:6]=='remove':
    try:
      print(f'phone number removed for {name}')
      name=cmd[7:]
      phoneBook.pop(name)

    except:
      print('Phone number not found.')

  elif cmd.lower()=='quit':
    print('Thank you for using the Python Phone Book Application.')
    break