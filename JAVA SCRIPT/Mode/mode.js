let modeBtn = document.querySelector("#mode");
let body = document.querySelector("body");
let currMode = "light";

modeBtn.addEventListener("click",() => {
    if(currMode === "light"){
        currMode = "dark";
        body.style.backgroundColor = "black";
        body.style.color = "white";
    }else{
        currMode = "light";
        body.style.backgroundColor = "white";
        body.style.color = "black";
    }

    console.log(currMode);
})