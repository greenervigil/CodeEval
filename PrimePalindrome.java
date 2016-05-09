class PrimePalindrome {

  final static int max = 1000;
  private static int div;
  private static int prime;
  static int num = 2;

  public static void main(String [] args){
    for(; num < max; num++){
      if (isPrime(num) && isPalindrome(num)){
        prime = num;
      }
    }
    System.out.println(prime);
  }
  //Test for Prime number
  public static boolean isPrime(int num){
      for(div = 2; div <= num/2; div++){
        if (num % div == 0){
          return false;
        }
        return true;
      }
  }

  public static boolean isPalindrome(int num){
    String splitNum = num.toString();
    int [] Array.toInt(check) = splitNum.split("").reverse();

    if (check == num){
      return true;
    }
    return false;
  }
}
