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

