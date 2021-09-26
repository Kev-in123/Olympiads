import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Homework {
  public static void main(String[] args){

    try {
      File file = new File("InFlandersFields.txt");
      BufferedReader br = new BufferedReader(new FileReader(file));
      String s;
      Pattern p = Pattern.compile("(\\w*oe|\\w*ow)", Pattern.CASE_INSENSITIVE);
      Matcher m;
      int count = 0;
      while ((s = br.readLine()) != null){
        m = p.matcher(s);
        while (m.find()) {
          ++count;
        }
      }
      System.out.println(count + " matches found");
      br.close();
    } catch (IOException e) {
      System.err.println("Cannot read file: " + e.getLocalizedMessage());
    }
  }
}
