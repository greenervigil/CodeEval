/**
The Fibonacci series is defined as: F(0) = 0; F(1) = 1;
F(n) = F(n–1) + F(n–2) when n>1. Given an integer n≥0,
print out the F(n).

The first argument will be a path to a filename containing integer numbers, one per line.

Print to stdout, the fibonacci number, F(n).

*/
import java.io.*;

class Fibonacci{

  public static void main(String [] args) throws IOException{

    String line = null;
    //look for file for input
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null){
        //while there is a line with data send it to getFib method //converting to the line to a string.
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
