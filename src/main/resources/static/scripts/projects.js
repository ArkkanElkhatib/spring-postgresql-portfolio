let background = document.querySelectorAll(".main__background__container");
let btn = document.querySelectorAll(".main__project__element");


for (let i = 0; i < btn.length; i++) {
    btn[i].addEventListener("click", () => {
        background[i].style.display = "block";
    })
}

window.onclick = (event) => {
    for (let i = 0; i < background.length; i++) {
        if (event.target == background[i]) {
            background[i].style.display = "none";
        }
    }
}