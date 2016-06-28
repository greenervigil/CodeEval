/*
Write a program which finds the next-to-last word in a string.

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. Input example is the following

some line with text
another line
Each line has more than one word.

OUTPUT SAMPLE:

Print the next-to-last word in the following way.

with
another
*/
import java.io.*;

public class Penultimate {
  public static void main(String [] args) throws IOException{

    //try-catch to open the file provided by ARGS
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      String ln;
      while ((ln = br.readLine()) != null){
        String [] newLine = ln.split("\\s");
        System.out.println(newLine[newLine.length - 2]);
        }
      }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }
}
