/*
CHALLENGE DESCRIPTION:

You are given a string 'S' and a character 't'. Print out the position of the rightmost occurrence of 't' (case matters) in 'S' or -1 if there is none. The position to be printed out is zero based.

INPUT SAMPLE:

The first argument will ba a path to a filename, containing a string and a character, comma delimited, one per line. Ignore all empty lines in the input file. E.g.
Hello World,r
Hello CodeEval,E

Print out the zero based position of the character 't' in string 'S', one per line. Do NOT print out empty lines between your output.
*/
import java.io.*;
public class Rightmost {
  public static void main (String [] args) throws IOException{
    String line = null;

    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null){
        String [] arr = line.split(",");
        if (arr.length > 0){
          String evalString = arr[0];
          char t = arr[1].charAt(0);
          //System.out.println(evalString + " " + t);
          System.out.println(findChar(evalString, t));
        }
      }

      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }
  public static int findChar(String line, char c) {
    return line.lastIndexOf(c);
  }
}
