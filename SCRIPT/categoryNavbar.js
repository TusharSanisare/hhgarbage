
const leftArrow = document.getElementById("categories-left-arrow");
const rightArrow = document.getElementById("categories-right-arrow");
const categoryList = document.getElementById("categories-list");

rightArrow.addEventListener("click", () => {
    categoryList.scrollLeft += 200;
});
leftArrow.addEventListener("click", () => {
    categoryList.scrollLeft -= 200;
});

