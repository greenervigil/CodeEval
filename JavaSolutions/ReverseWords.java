import java.io.*;
import java.util.*;

public class ReverseWords {

  public static void main(String [] args) throws IOException{

    //try-catch to open the file provided by ARGS
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      String ln;
      List<String> rev = new ArrayList<>();
      while ((ln = br.readLine()) != null){
        String [] ar = ln.split("\\s");
        if (ar.length > 0){
          for (String e : ar){
            rev.add(e);
          }
        reverse(rev);
        //System.out.println(Collections.reverse(rev));
        }
      }

      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }

  //method to reverse the words in a string array
  public static void reverse(List<String> arr){
    System.out.println(Collections.reverse(arr));
  }
}
