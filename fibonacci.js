var fs  = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") { // ignore empty lines
        console.log(fibonacci(line));
    }
});

function fibonacci(number){
  if (number <= 1){
    return number;
  }else{
    return getFib(number - 1) + getFib(number - 2);
  }
}
