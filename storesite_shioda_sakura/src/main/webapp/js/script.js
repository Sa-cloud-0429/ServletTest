function addToCart_Black() {
	let price = 10000;
	let Blackprice = parseInt(document.querySelector("#quantity_black").value);
	let total = price * Blackprice;
	console.log(Blackprice)
	document.querySelector("#black_shokei").innerHTML = total
}

function addToCart_Blue() {
	let price = 11000;
	let Blueprice = parseInt(document.querySelector("#quantity_blue").value);
	let total = price * Blueprice;
	console.log(Blueprice)
	document.querySelector("#blue_shokei").innerHTML = total
}

function addToCart_Gold() {
	let price = 12000;
	let Goldprice = parseInt(document.querySelector("#quantity_gold").value);
	let total = price * Goldprice;
	console.log(Goldprice)
	document.querySelector("#gold_shokei").innerHTML = total
}

function addToCart_Gray() {
	let price = 12000;
	let Grayprice = parseInt(document.querySelector("#quantity_gray").value);
	let total = price * Grayprice;
	console.log(Grayprice)
	document.querySelector("#gray_shokei").innerHTML = total
}

function addToCart_Lightblue() {
	let price = 11000;
	let Lightblueprice = parseInt(document.querySelector("#quantity_lightblue").value);
	let total = price * Lightblueprice;
	console.log(Lightblueprice)
	document.querySelector("#lightblue_shokei").innerHTML = total
}

function addToCart_Orange() {
	let price = 12000;
	let Orangeprice = parseInt(document.querySelector("#quantity_orange").value);
	let total = price * Orangeprice;
	console.log(Orangeprice)
	document.querySelector("#orange_shokei").innerHTML = total
}

function addToCart_PinkGlitter() {
	let price = 12000;
	let PinkGlitterprice = parseInt(document.querySelector("#quantity_pinkglitter").value);
	let total = price * PinkGlitterprice;
	console.log(PinkGlitterprice)
	document.querySelector("#pinkglitter_shokei").innerHTML = total
}

function addToCart_Purple() {
	let price = 13000;
	let Purpleprice = parseInt(document.querySelector("#quantity_pueple").value);
	let total = price * Purpleprice;
	console.log(Purpleprice)
	document.querySelector("#purple_shokei").innerHTML = total
}


function addToCart_RedPink() {
	let price = 14000;
	let RedPinkprice = parseInt(document.querySelector("#quantity_redpink").value);
	let total = price * RedPinkprice;
	console.log(RedPinkprice)
	document.querySelector("#redpink_shokei").innerHTML = total
}

function addToCart_White() {
	let price = 14000;
	let Whiteprice = parseInt(document.querySelector("#quantity_white").value);
	let total = price * Whiteprice;
	console.log(Whiteprice)
	document.querySelector("#white_shokei").innerHTML = total
}

function addToCart_YellowBlack() {
	let price = 14000;
	let YellowBlackprice = parseInt(document.querySelector("#quantity_yellowblack").value);
	let total = price * YellowBlackprice;
	console.log(YellowBlackprice)
	document.querySelector("#yellowblack_shokei").innerHTML = total
}


function total_calc() {
	let Blackprice = Number(document.getElementById("black_shokei").textContent);
	let Blueprice = Number(document.getElementById("blue_shokei").textContent);
	let Goldprice = Number(document.getElementById("gold_shokei").textContent);
	let Grayprice = Number(document.getElementById("#quantity_gray").value);
	let Lightblueprice = Number(document.getElementById("#quantity_lightblue").textContent);
	let Orangeprice = Number(document.getElementById("#quantity_orange").textContent);
	let PinkGlitterprice = Number(document.getElementById("#quantity_pinkglitter").textContent);
	let Purpleprice = Number(document.getElementById("#quantity_purple").textContent);
	let RedPinkprice = Number(document.getElementById("#quantity_redpink").textContent);
	let Whiteprice = Number(document.getElementById("#quantity_white").textContent);
	let YellowBlackprice = Number(document.getElementById("#quantity_yellowblack").textContent);
	console.log(Blackprice)
	console.log(Blueprice)
	console.log(Goldprice)
	console.log(Grayprice)
	console.log(Lightblueprice)
	console.log(Orangeprice)
	console.log(PinkGlitterprice)
	console.log(Purpleprice)
	console.log(RedPinkprice)
	console.log(Whiteprice)	
	console.log(YellowBlackprice)
	let total = Blackprice + Blueprice + Goldprice + Grayprice + Lightblueprice + Orangeprice + 
	 PinkGlitterprice + Purpleprice + RedPinkprice + Whiteprice + YellowBlackprice;
	console.log(total)
	document.querySelector("#total").innerHTML = total
}


$(document).ready(function() {
	$('.slider').slick({
		autoplay: true,
		autoplaySpeed: 3000,
		infinite: true,
		dots: true,
		slidesToShow: 1,
		slidesToScroll: 1,
		arrows: true,
		dits: true,
	});
});


/*----------
カート
-------------*/

let cart = [];

function updateCart() {
	$("#cart-products").empty();
	let total = 0;
	cart.forEach((product, index) => {
		let productTotal = product.price * product.quantity;
		total += productTotal;
		$("#cart-products").append(`
			<div class="cart-product>
			<p>${product.name} × ${product.quantity} - ${productTotal}</p>
			<button class="remove-item" data-index="${index}"></button>
			</div>
			`);
	});
	$("#cart-total").text(`合計: ${total}`);
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



$(document).on("click", ".add-to-cart", function() {
	let parent = $(this).closest(".product");
	let name = parent.data("name");
	let price = parseInt(parent.data("price"));
	let quantity = parseInt(parent.find(".quantity").val());

	addToCart(name, price, quantity);
});


$("#clear-products").on("click", ".remove-product", function() {
	let index = $(this).data("index");
	cart.splice(index, 1);
	updateCart();
});

$("#clear-cart").on("click", function() {
	cart = [];
	updateCart();
});

/*-----------------
価格順
------------------*/

let ascending = false;
$("#sort-botton").on("click", function() {
	console.log(1)
	let products = $(".product").toArray();

	products.sort(function(a, b) {
		let priceA = parseInt($(a).data("price"));
		let priceB = parseInt($(b).data("price"));
		return ascending ? priceA - priceB : priceB - priceA;
	});

	$(".products-container").empty().append(products);
	ascending = !ascending;
	$(this).text(ascending ? "PRICE(LOW)" : "PRICE(HIGH)");
});

/*=================================================
  モーダルウィンドウ
  ===================================================*/
$("#open-cart-modal").click(function() {
	$("#cart-modal").fadeIn();
	updateCart();
});

$("#close-cart-modal").click(function() {
	$("#cart-modal").fadeOut();
});




//フォームバリテーション
document.getElementById("contact-form").addEventListener("submit", function(e) {
	const name = document.getElementById("name").value.trim();
	const email = document.getElementById("email").value.trim();
	const message = document.getElementById("message").value.trim();

	let errorMessage = "";

	if (name === "") {
		errorMessage += "名前を入力してください \n";
	}

	if (email === "") {
		errorMessage += "メールアドレスを入力してください \n";
	} else if (!email.match(/^[\w.-]+@[\w.-]+\.\w+$/)) {
		errorMessage += "メールアドレスの形式が正しくありません \n";
	}

	if (message === "") {
		errorMessage += "メッセージを入力してください \n";
	}

	if (errorMessage !== "") {
		alert(errorMessage);
		e.preventDefault();
	}

});