$(document).ready(function() {
 $(".accordion-header").click(function() {
 // クリックされた要素の次の要素（.accordion-content）を開閉 
$(this).next(".accordion-content").slideToggle();  
// 他の開いているコンテンツを閉じる（アコーディオン形式） 
$(".accordion-content").not($(this).next()).slideUp();  
// メニューの背景色を変更（アクティブ状態をわかりやすくする） 
$(".accordion-header").removeClass("active"); 
$(this).addClass("active"); }); });