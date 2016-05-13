import java.io.*;

class Fibonacci{

  public static void main(String [] args) throws IOException{
    //String numbers = "numbers.txt";
    String line = null;

    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null){
        System.out.println(getFib(Integer.parseInt(line)));
      }

      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }

  /**
  determines the Fibonacci sequence
  */
  public static int getFib(int n){
    if (n <= 1){
      return n;
    }else{
      return getFib(n-1) + getFib(n-2);
    }
  }
}
