/*
You will be given a hexadecimal (base 16) number. Convert it into decimal (base 10).

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. Each line in this file contains a hex number. You may assume that the hex number does not have the leading 'Ox'. Also all alpha characters (a through f) in the input will be in lowercase. E.g.

9f
11
OUTPUT SAMPLE:

Print out the equivalent decimal number. E.g.

159
17
*/
import java.io.*;

public class HexDec {
  public static void main(String [] args) throws IOException{

    //try-catch to open the file provided by ARGS
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      String ln;
      while ((ln = br.readLine()) != null){
        System.out.println(decimalConverter(ln));
      }

      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }
  public static int decimalConverter(String st) {
    String digits = "0123456789ABCDEF";
    int value = 0;
    st = st.toUpperCase();
    for(int i = 0; i < st.length(); i++) {
      char ch = st.charAt(i);
      int digit = digits.indexOf(ch);
      value = 16 * value + digit;
    }
    return value;
  }
}
