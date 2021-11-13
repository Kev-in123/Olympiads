import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class Homework {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    List<String> todo = new ArrayList<String>();
    String cmd;
    String item;
    Integer index;
    Integer index2;
    while (true) {
      System.out.print("> ");
      cmd = input.nextLine();
      if (cmd.startsWith("add")) {
        item = cmd.substring(4);
        todo.add(item);
      } else if (cmd.startsWith("list")) {
        if (cmd.length() > 5) {
          index = Integer.parseInt(cmd.substring(5)) - 1;
          System.out.println(todo.get(index));
        } else {
          for (int i = 0; i < todo.size(); ++i) {
            System.out.println((i + 1) + ": " + todo.get(i));
          }
        }

      } else if (cmd.startsWith("remove")) {
        index = Integer.parseInt(cmd.substring(7)) - 1;
        item = todo.get(index);
        todo.remove(item);

      } else if (cmd.equals("quit")) {
        break;

      } else if (cmd.startsWith("random")) {
        todo = new ArrayList<String>(todo);
        Collections.shuffle(todo);

      } else if (cmd.startsWith("move")) {
        index = Integer.parseInt(cmd.substring(5, 6)) - 1;
        index2 = Integer.parseInt(cmd.substring(7)) - 1;
        String temp = todo.get(index);
        todo.set(index, todo.get(index2));
        todo.set(index2, temp);

      } else if (cmd.startsWith("update")) {
        index = Integer.parseInt(cmd.substring(8)) - 1;
        item = input.nextLine();
        todo.set(index, item);
      }

    }
    input.close();
  }
}
