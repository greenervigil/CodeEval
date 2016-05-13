class Fibonacci{

  public static void main(String [] args){
    int x;
    System.out.println(getFib(x));
  }

  /**
  determines the Fibonacci sequence
  */
  public int getFib(int n){
    if (n <= 1){
      return n;
    }else{
      return getFib(n-1) + getFib(n-2);
    }
  }
}
