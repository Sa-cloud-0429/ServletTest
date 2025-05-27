$(document).ready(function(){
  // Slickスライダーの初期化
  $(".slider").slick({
      dots: false,         
      infinite: true,     
      slidesToShow: 4,    
      slidesToScroll: 1,  
      autoplay: true,     
      autoplaySpeed: 3000 
  });

  /*=================================================
  カート機能
  ===================================================*/
  let cart = [];

  function updateCart() {
      $("#cart-items").empty();
      let total = 0;
      cart.forEach((item, index) => {
          let itemTotal = item.price * item.quantity;
          total += itemTotal;
          $("#cart-items").append(`
              <div class="cart-item">
                  <p>${item.name} × ${item.quantity} - ¥${itemTotal}</p>
                  <button class="remove-item" data-index="${index}">削除</button>
              </div>
          `);
      });
      $("#cart-total").text(`合計: ¥${total}`);
  }

  function addToCart(name, price, quantity) {
      let existingItem = cart.find(item => item.name === name);
      if (existingItem) {
          existingItem.quantity += quantity;
      } else {
          cart.push({ name, price, quantity });
      }
      updateCart();
  }

  $(document).on("click", ".add-to-cart", function(){
      let parent = $(this).closest(".item");
      let name = parent.data("name");
      let price = parseInt(parent.data("price"));
      let quantity = parseInt(parent.find(".quantity").val());

      addToCart(name, price, quantity);
  });

  $("#cart-items").on("click", ".remove-item", function(){
      let index = $(this).data("index");
      cart.splice(index, 1);
      updateCart();
  });

  $("#clear-cart").click(function(){
      cart = [];
      updateCart();
  });

  /*=================================================
  ソート機能（価格順）
  ===================================================*/
  let ascending = true;
  $("#sort-btn").on("click", function(){
      let items = $(".item").toArray();

      items.sort(function(a, b) {
          let priceA = parseInt($(a).data("price"));
          let priceB = parseInt($(b).data("price"));
          return ascending ? priceA - priceB : priceB - priceA;
      });

      $(".items-container").empty().append(items);
      ascending = !ascending;
      $(this).text(ascending ? "価格順 (昇順)" : "価格順 (降順)");
  });

  /*=================================================
  モーダルウィンドウ
  ===================================================*/
  $("#open-cart-modal").click(function(){
      $("#cart-modal").fadeIn();
      updateCart();
  });

  $("#close-cart-modal").click(function(){
      $("#cart-modal").fadeOut();
  });
});
