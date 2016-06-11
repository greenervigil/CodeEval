/**
*Write a program which determines the sum of the first 1000 prime *numbers.
**/
class PrimeSum{
  public static void main(String [] args){

    int sum = 0;
    int primeCount = 0;

    for (int x = 2; x <= 10000; x++){
      if(isPrime(x)){
          sum += x;
          primeCount++;
      }
      if(primeCount == 1000){
        break;
      }
    }
    System.out.println(sum);
  }

  static boolean isPrime(int num){
    if (num == 2) {
      return true;
    }
    for(int x = 2; x <= num/2; x++){
      if (num % x == 0) {
        return false;
      }
    }
    return true;
  }
}
