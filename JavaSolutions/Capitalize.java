/*
Write a program which capitalizes the first letter of each word in a sentence.
*/
import java.io.*;
public class Capitalize{
  public static void main(String [] args) throws IOException{

    //try-catch to open the file provided by ARGS
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      String ln;
      while ((ln = br.readLine()) != null){
        String [] ar = ln.split("\\s");
        if (ar.length > 0){
          for (String e : ar){
            System.out.print(capitalize(e) + " ");
          }
          System.out.println("");
        }
      }

      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }
  public static String capitalize(String string){
    return string.substring(0, 1).toUpperCase() + string.substring(1);
  }
}
