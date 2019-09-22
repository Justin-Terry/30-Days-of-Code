function processData(input) {
    var inp = input;
    var arr = input.split("\n");
    var t = arr[0];

    for(var i = 1; i < arr.length; i++){
        var n = arr[i];
        var result = "Prime";
        if(n == 1) {
            result = "Not prime";
        }else{
            for(var j = 2; j <= Math.sqrt(n); j++){
                if(n%j == 0){
                    result = "Not prime";
                    break;
                }
            }
        }
        console.log(result);
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
