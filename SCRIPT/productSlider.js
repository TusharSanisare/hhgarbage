const productCardList = document.getElementById("product-card-list");
const productLeftArrow = document.getElementById("product-left-arrow");
const productRightArrow = document.getElementById("product-right-arrow");

productLeftArrow.addEventListener("click", () => {
    productCardList.scrollLeft -= 500;
});

productRightArrow.addEventListener("click", () => {
    productCardList.scrollLeft += 500;
});