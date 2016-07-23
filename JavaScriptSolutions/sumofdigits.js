/*Given a positive integer, find the sum of its constituent digits.

//INPUT SAMPLE:

//The first argument will be a path to a filename containing positive integers, one per line. E.g.

//23
//496
//OUTPUT SAMPLE:

//Print to stdout, the sum of the numbers that make up the integer, one per line. E.g.

//5
//19
*/
var fs  = require("fs");

function summation(num){
  var numbers = [];
  var sum = 0;
  for (var n = 0; n < num.length; n++) {
    numbers[n] = parseInt(num.charAt(n));
  }
  for (var i = 0; i < num.length; i++){
    sum += numbers[i];
  }
  console.log(sum);
};

fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    var sum = 0;
    if (line !== "") { // ignore empty lines
      summation(line);
    }
});
