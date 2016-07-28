/*
An Armstrong number is an n-digit number that is equal to the sum of the n'th powers of its digits. Determine if the input numbers are Armstrong numbers.

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. Each line in this file has a positive integer. E.g.
1
2
3
6
153
351
OUTPUT SAMPLE:
Print out True/False if the number is an Armstrong number or not. E.g.
1
2
3
True
True
False
*/
var fs  = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") { // ignore empty lines
        console.log(armstrong(line));
    }
});

function armstrong(evaluationNumber) {
  var evaluationNumberArray = evaluationNumber.split("");

  if (sumArray(evaluationNumberArray) === parseInt(evaluationNumber)) {
    return "True";
  }
  return "False";
}

function sumArray(arr) {
  var sum = 0;
  var powdigit = arr.length;
  if (powdigit === 1) return "True";
  for (var s = 0; s < powdigit; s++) {
    sum += Math.pow(arr[s], powdigit);
  }
  return sum;
}
