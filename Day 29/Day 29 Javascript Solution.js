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
    const t = parseInt(readLine(), 10);

    for (let tItr = 0; tItr < t; tItr++) {
        const nk = readLine().split(' ');

        const n = parseInt(nk[0], 10);

        const k = parseInt(nk[1], 10);

        // If k <= n then it has the same or less bits as n. Therefore the max
        // difference would be one less than k since the challenge specifies that
        // the answer must be less than k
        if((k-1 | k) <= n){
            console.log(k-1);
        }
        // If k and k-1 > n then there is atleast one bit that will not match
        // therefore the max possible is k-2.
        else{
            console.log(k-2);
        }
    }
}
