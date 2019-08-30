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

function isEven(n) {
    if (n % 2 == 0) {
        return true;
    }
    return false;
}

function inRange(n, low, high) {
    if ((n >= low) && (n <= high)) {
        return true;
    }
    return false;
}


function main() {
    const N = parseInt(readLine(), 10);

    if (!isEven(N)) {
        console.log("Weird");
    } else if (isEven(N) && inRange(N, 1, 5)) {
        console.log("Not Weird");
    } else if (isEven(N) && inRange(N, 6, 20)) {
        console.log("Weird");
    } else {
        console.log("Not Weird");
    }

}
