function processData(input) {
    //Enter your code here
    var phoneBook = new Map();
    var items = input.split("\n")

    for (var i = 1; i <= items[0] ;i++) {
        entry = items[i].split(" ");
        phoneBook.set(entry[0], entry[1])
    }

    for (var j = i; j < items.length; j++) {
        if (phoneBook.has(items[j])) {
            console.log(items[j] + "=" + phoneBook.get(items[j]));
        } else {
            console.log("Not found")
        }
    }    
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
