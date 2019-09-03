function processData(input) {
    var items = input.split('\n');

    for (var i = 1; i <= items[0]; i++) {
        printStrings(items[i]);
    }
} 

function printStrings(str) {
    var evens = '';
    var odds = '';

    for (var i = 0; i < str.length; i++) {
        if (i % 2 == 0) {
            evens += str.charAt(i);
        } else {
            odds += str.charAt(i);
        }
    }

    console.log(evens + " " + odds);
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
