/*
  Print out the table in a matrix like fashion, each number formatted to a width of 4 (The numbers are right-aligned and strip out leading/trailing spaces on each line).
*/
var start = 1;
var table = [];
while (start <= 12){
  for (var i = 1; i <= 12; i++){
    var number = start * i;
    table.push(number);
  }
  console.log(table.join(""));
  table = [];
  start++;
}
