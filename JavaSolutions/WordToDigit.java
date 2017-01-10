/**
CHALLENGE DESCRIPTION:
Having a string representation of a set of numbers you need to print this numbers.

All numbers are separated by semicolon. There are up to 20 numbers in one line. The numbers are "zero" to "nine"

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. Each line in this file is one test case. E.g.

zero;two;five;seven;eight;four
three;seven;eight;nine;two
OUTPUT SAMPLE:

Print numbers in the following way:

025784
37892
*/
import java.io.*;
public class WordToDigit {
  public static void main(String [] args) throws IOException{

    String line = null;
    //look for file for input
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null){
        String [] arr = line.split(";");
        System.out.println(convertWordToDigit(arr));
      }
      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }

  public static String convertWordToDigit(String [] numbers) {
    String digits = "";
    for (String n : numbers) {
      switch(n){
        case("zero"):
          digits = digits + "0";
          break;
        case("one"):
          digits = digits + "1";
          break;
        case("two"):
          digits = digits + "2";
          break;
        case("three"):
          digits = digits + "3";
          break;
        case("four"):
          digits = digits + "4";
          break;
        case("five"):
          digits = digits + "5";
          break;
        case("six"):
          digits = digits + "6";
          break;
        case("seven"):
          digits = digits + "7";
          break;
        case("eight"):
          digits = digits + "8";
          break;
        case("nine"):
          digits = digits + "9";
          break;
        default:
          System.out.println("cannot convert this .... " + n);
          break;
      }
    }
    return digits;
  }
}
