process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function main() {
    var n = parseInt(readLine());
    a = readLine().split(' ');
    a = a.map(Number);
    // Write Your Code Here

    var thisRound = 1;
    var numSwaps = 0;

    while(thisRound > 0) {
        thisRound = 0;
        for(var i = 0; i < a.length - 1; i++) {
            if(a[i] > a[i+1]){
                var temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                numSwaps++;
                thisRound++;
            }
        }
    }

    console.log("Array is sorted in " +numSwaps + " swaps.");
    console.log("First Element: " + a[0]);
    console.log("Last Element: " + a[a.length - 1]);
}

