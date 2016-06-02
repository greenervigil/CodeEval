var fs  = require("fs");

function fizzBuzz(inputArray){
  var arr = inputArray.split(" ");
  var x = arr[0];
  var y = arr[1];
  var n = arr[2];
  var newArray = [];

  for (var i = 1; i <= n; i++){
    if (i % x === 0 && i % y === 0){
      newArray.push("FB");
    }else if (i % x === 0){
      newArray.push("F");
    }else if (i % y === 0){
      newArray.push("B");
    }else {
      newArray.push(i);
    }
  }
  return newArray.join(" ");
}

fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") { // ignore empty lines
        console.log(fizzBuzz(line));
    }
});
