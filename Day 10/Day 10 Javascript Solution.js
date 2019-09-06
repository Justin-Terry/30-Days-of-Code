'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}



function main() {
    const n = parseInt(readLine(), 10);
    var myN = n;
    var max = 0;
    var tempMax = 0;

    while (myN >= 1) {
        if (myN % 2 == 1) {              
            tempMax++;              
            if (tempMax > max) {
                max = tempMax;      
            }
        } else {
            tempMax = 0;            
        }
        myN = Math.floor(myN / 2);                 
    }

    console.log(max);
}
