function processData(input) {
    //Enter your code here
    var phoneBook = new Map();
    var items = input.split("\n")

    var n = items[0]
    for (var i = 1; i <= n ;i++) {
        entry = items[i].split(" ");
        phoneBook.set(entry[0], entry[1])
    }

    for (var j = (n + 1); j < items.size; j++) {
        var name = items[j];
        console.log(name);
        if (phoneBook.has(name)) {
            console.log(items[j] + "=" + phoneBook.get(name));
        } else {
            console.log("Not found");
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
