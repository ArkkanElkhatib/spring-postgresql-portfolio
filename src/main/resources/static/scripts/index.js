let navbar__burger = document.querySelector(".navbar__burger");
let navbar__burger__clicked = false;
let navbar__burger__layers = document.querySelectorAll(".navbar__burger__layer");

navbar__burger.addEventListener("click", () => {
    console.log("clicked");

    navbar__burger__clicked = !navbar__burger__clicked;
    if (navbar__burger__clicked) {
        navbar__burger.classList.add("burger__clicked");
        navbar__burger__layers[0].classList.add("layer__1__clicked");
        navbar__burger__layers[1].classList.add("layer__2__clicked")
        navbar__burger__layers[2].classList.add("layer__3__clicked")
    } else {
        if (navbar__burger.classList.contains("burger__clicked")) {
            navbar__burger.classList.remove("burger__clicked");
            navbar__burger__layers[0].classList.remove("layer__1__clicked");
            navbar__burger__layers[1].classList.remove("layer__2__clicked")
            navbar__burger__layers[2].classList.remove("layer__3__clicked")
        }
    }
});
