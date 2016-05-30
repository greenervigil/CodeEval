var sum = 0;
var primeCount = 0;

for (var num = 2; num <= 10000; num++){
  if (isPrime(num)){
    sum += num;
    primeCount++;
  }
}

console.log(sum);

function isPrime(number){
  if (number == 2){
    return true;
  }
  for (var x = 2; x <= number/2; x++){
    if (number % x == 0){
      return false;
    }
  }
  return true;
}
