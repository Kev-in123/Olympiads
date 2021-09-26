import random

todo_list = []
while True:
  command = input()
  if command == "quit":
    break
  
  elif command == "list":
    print('TO-DO list')
    for i in range(len(todo_list)):
      print(f'\t {i+1} : {todo_list[i]}')

  elif command[0:3] == "add":
	  todo_list.append(command[4:])

  elif command[0:6]=='remove':
    command.pop(int(command[8:])-1)

  
  elif command[0:6]=="update":
    for i in range(7, len(command)):
      if command[i]=='':
        break
      num=int(command[6:1])
      description=command[i+1:]
      todo_list[num-1]=description

  elif command[0:5]=="random":
    random.shuffle(todo_list)
    print('TO-DO list')
    for i in range(len(todo_list)):
      print(f'\t {i+1} : {todo_list[i]}')
  
  elif command[0:3]=='move':
    old_num=int(command[4:]-1)
    new_num=int(input())
    item = todo_list[old_num - 1]
    todo_list[old_num - 1] = todo_list[new_num - 1]
    todo_list[new_num - 1] = item































'''
toDoList=[]
def toDo():
  userInput=str(input("Do you want to: \n add an item to the list (use \"add\"), \n undate an item in the list (use \"update\"), \n list an item or all the items (use \"list\"), \n remove an item (use \"remove\"), \n or quit? (use \"quit\")? "))
  
  if userInput.lower()=='add':
    addToList=str(input("What do you want to add to the list? "))
    if addToList != None:
      toDoList.append(addToList)
    else:
      print('Invalid arguments')
    toDo()

  elif userInput.lower()=='move':
    num=int(input("which item do you want to move in the list? "))
    pos=int(input("Where do you want to move it? "))
    toDoList.pop(num-1)
    toDoList.insert(pos,toDoList[num-1])
    toDo()

  elif userInput.lower()=='update':
    num=int(input("Which item do you want to update "))
    newValue=input("What do you want it to be? ")
    toDoList[num-1]=newValue
    print('TO-DO list')
    for i in range(len(toDoList)):
      print(f'\t {i+1} : {toDoList[i]}')
    toDo()

  elif userInput.lower()=='list':
    num=input("Which number do you want to see on the list? type 'all' to view the entire list ")
    if num == 'all':
      print('TO-DO list')
      for i in range(len(toDoList)):
        print(f'\t {i+1} : {toDoList[i]}')
    else:
      print(toDoList(num-1))
    toDo()

  elif userInput.lower()=='remove':
    removeFromList=int(input("What do you want to remove from the list? "))
    toDoList.pop(removeFromList-1)
    toDo()
  
#  elif userInput.lower()=='update':


  elif userInput.lower() == 'random':
    random.shuffle(toDoList)
    print('TO-DO list')
    for i in range(len(toDoList)):
      print(f'\t {i+1} : {toDoList[i]}')
    toDo()

  elif userInput.lower()=='quit':
    print('quiting...')

  else:
    print('Invalid arguments')
    toDo()

toDo()
'''