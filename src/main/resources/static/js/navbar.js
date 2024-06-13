// 메뉴 토글 버튼 작동
const toogleBtn = document.querySelector(".navbar_tooglebtn");
const menu = document.querySelector(".nav_menu");
const icons = document.querySelector(".nav_icon");

toogleBtn.addEventListener("click", () => {
    menu.classList.toggle("active");
    icons.classList.toggle("active");
});