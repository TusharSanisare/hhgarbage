let product_img = document.getElementById("product-img");
let imgs = document.querySelectorAll(".img");

imgs.forEach(img => {
    img.addEventListener('click', () => {
        let url = window.getComputedStyle(img, null).getPropertyValue('background-image');
        url = url.slice(4, -1).replace(/["']/g, '');
        product_img.src = url;

        imgs.forEach(act => {
            act.classList.remove("active");
        })
        img.classList.add("active");
    })
})