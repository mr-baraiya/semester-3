
function display(val) { 
    document.getElementById("result").value += val 
} 
function myFunction(event) { 
    if (event.key == '0' || event.key == '1' 
        || event.key == '2' || event.key == '3' 
        || event.key == '4' || event.key == '5' 
        || event.key == '6' || event.key == '7' 
        || event.key == '8' || event.key == '9' 
        || event.key == '+' || event.key == '-' 
        || event.key == '*' || event.key == '/') 
        document.getElementById("result").value += event.key; 
} 
function solve() { 
    let x = document.getElementById("result").value;
    let y = eval(x); 
    document.getElementById("result").value = y;
} 
function clr() { 
    document.getElementById("result").value = "" 
} 