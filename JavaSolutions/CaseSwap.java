/*
Write a program which swaps letters' case in a sentence. All non-letter characters should remain the same.

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. Input example is the following

Hello world!
JavaScript language 1.8
A letter
OUTPUT SAMPLE:

Print results in the following way.

hELLO WORLD!
jAVAsCRIPT LANGUAGE 1.8
a LETTER
*/
import java.io.*;

public class CaseSwap {
  public static void main(String [] args) throws IOException{
    String ln;
    //try-catch to open the file provided by ARGS
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);

      while ((ln = br.readLine()) != null){
        String [] ar = ln.split("\\s");
        if (ar.length > 0){
          for (String e : ar){
            System.out.print(swap(e) + " ");
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

  public static String swap(String swapString){
    String [] arr = swapString.split("");
    String sender = "";
    for (String c : arr){
      if (c == c.toUpperCase()){
          sender += c.toLowerCase();
      }else {
        sender += c.toUpperCase();
      }
    }
    return sender;
  }
}
