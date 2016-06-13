/*
  Print out the table in a matrix like fashion, each number formatted to a width of 4 (The numbers are right-aligned and strip out leading/trailing spaces on each line).
*/

public class MultiplicationTable {
  public static void main(String [] args){
    int tablePrimer = 1;
    while (tablePrimer <= 12 ){
      for (int x = 1; x <= 12; x++){
        int value = x * tablePrimer;
        System.out.printf("%4d", value);
      }
      tablePrimer++;
      System.out.printf("%n");
    }
  }
}
