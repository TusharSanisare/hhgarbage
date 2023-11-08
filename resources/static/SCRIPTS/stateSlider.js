

var swiper = new Swiper(".mySwiper-stageContainer", {
    slidesPerView: 5,
    spaceBetween: 10,
    freeMode: true,
    mousewheel: true,
    speed: 1500,
    grabCursor: true,
    autoplay: {
        delay: 100,
        disableOnInteraction: false,
    },
    pagination: {
        el: ".swiper-pagination",
        clickable: true,
    },
});