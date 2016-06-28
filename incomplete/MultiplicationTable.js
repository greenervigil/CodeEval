var start = 1;
var table = [];
while (start <= 12){
  for (var i = 1; i <= 12; i++){
    var number = start * i;
    table.push(number);
  }
  console.log(table.join(" "));
  table = [];
  start++;
}
