/*
There is a game where each player picks a number from 1 to 9, writes it on a paper and gives to a guide. A player wins if his number is the lowest unique. We may have 10-20 players in our game.

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename.

You're a guide and you're given a set of numbers from players for the round of game. E.g. 2 rounds of the game look this way:

3 3 9 1 6 5 8 1 5 3
9 2 9 9 1 8 8 8 2 1 1
OUTPUT SAMPLE:

Print a winner's position or 0 in case there is no winner. In the first line of input sample the lowest unique number is 6. So player 5 wins.

5
0

*/
import java.io.*;

public class LowestUnique {
  public static void main(String [] args) throws IOException{

    //try-catch to open the file provided by ARGS
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      String ln;
      while ((ln = br.readLine()) != null){
        String [] ar = ln.split("\\s");
        System.out.println(uniqueSort(ar));
      }

      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }

  public static String uniqueSort(String [] evaluatingArray) {
    String eval = "";
    for (int i = 0; i <= evaluatingArray.length; i++){
      for (String e : evaluatingArray){
        if (evaluatingArray[i] == e){
        }else if (Integer.parseInt(evaluatingArray[i]) < Integer.parseInt(e)){
          eval = e;
        }else {
          continue;
        }
      }
    }
    return eval;
  }
}
