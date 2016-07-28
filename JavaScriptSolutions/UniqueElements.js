/*
You are given a sorted list of numbers with duplicates. Print out the sorted list with duplicates removed.

INPUT SAMPLE:

File containing a list of sorted integers, comma delimited, one per line. E.g.

1
2
1,1,1,2,2,3,3,4,4
2,3,4,5,5
OUTPUT SAMPLE:

Print out the sorted list with duplicates removed, one per line.
E.g.


1
2
1,2,3,4
2,3,4,5
*/

var fs  = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") { // ignore empty lines
        console.log(listSort(line.split(",")));
    }
});

function listSort(listArray) {
  if (listArray === 0) {
    return listArray;
  }
  listArray = listArray.sort(function (a,b) {
    return a*1 - b*1
  });
  var finishedArray = [listArray[0]];
  for (var i = 1; i < listArray.length; i++) {
    if (listArray[i-1] !== listArray[i]) {
      finishedArray.push(listArray[i]);
    }
  }
  return finishedArray.join(",");
}
