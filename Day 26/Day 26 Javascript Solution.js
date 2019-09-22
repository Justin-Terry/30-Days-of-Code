function processData(input) {
    var inputs = input.split("\n");
    var returned = inputs[0].split(" ");
    var dueDate = inputs[1].split(" ");
    var fee = 0;

    if(Number(returned[2]) == Number(dueDate[2])){
        // Same Year
        if(Number(returned[1]) == Number(dueDate[1])){
            // Same month
            if(Number(returned[0]) > Number(dueDate[0])){
                // Late
                fee = (Number(returned[0]) - Number(dueDate[0])) * 15;
            }
        } else{
            // 
            if(Number(returned[1]) > Number(dueDate[1])){
                fee = (Number(returned[1]) - Number(dueDate[1])) * 500; 
            }
        }
    } else if(Number(returned[2]) > Number(dueDate[2])){
        fee = 10000;
    }

    console.log(fee);
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
