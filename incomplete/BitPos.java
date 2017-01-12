/*
Given a number n and two integers p1,p2 determine if the bits in position p1 and p2 are the same or not. Positions p1 and p2 are 1 based.

INPUT SAMPLE:

The first argument will be a path to a filename containing a comma separated list of 3 integers, one list per line. E.g.

86,2,3
125,1,2
OUTPUT SAMPLE:

Print to stdout, 'true'(lowercase) if the bits are the same, else 'false'(lowercase). E.g.

true
false
*/
import java.io.*;
import java.util.BitSet;

public class BitPos {
  public static void main(String [] args) throws IOException{

    String line = null;
    //look for file for input
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null){
        //while there is a line with data send it to bitCompare method
        System.out.println(bitCompare(line));
      }
      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }

  public static Boolean bitCompare(String str) {
    //separate the string into three parts; number, pos1, and pos2
    String [] evalArray = str.split(",");
    //convert number from int to bits
    int number = Integer.parseInt(evalArray[0]);
    BitSet b = new BitSet(number);
    int pos1 = Integer.parseInt(evalArray[1]);
    int pos2 = Integer.parseInt(evalArray[2]);

    //compare the two positions for equality, return true if they are
    // and false if they are not
    if (b.get(pos1) == b.get(pos2)){
      return true;
    }
    return false;
  }
}
