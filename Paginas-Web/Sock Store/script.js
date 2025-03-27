const products = [
    {
        id: 1,
        name: "Calcetines de Rayas",
        price: 9.99,
        image: "https://leitelarsa.es/tienda/wp-content/uploads/2023/06/Calcetines_1@2x.png"
    },
    {
        id: 2,
        name: "Calcetines Deportivos",
        price: 12.99,
        image: "https://store.realsporting.com/cdn/shop/files/background-editor_output_ef086a18-b607-4cd8-8a6c-fd01bc682597.png?v=1740512794&width=320"
    },
    {
        id: 3,
        name: "Calcetines de Invierno",
        price: 14.99,
        image: "https://images.jackjones.com/12258995/4522470/001/jackjones-jacscenerysocks5pack-rosa.png?v=7a948ee7406532dc78f149cb90ca11ec"
    },
    {
        id: 4,
        name: "Calcetines de Algodón",
        price: 8.99,
        image: "https://yuyubeesocks.es/cdn/shop/files/calcetines-cafe-en-vasoyuyubee-socks-471874.png?v=1724103001&width=1445"
    },
    {
        id: 5,
        name: "Calcetines Estampados",
        price: 11.99,
        image: "https://www.bicicletasmr.com/39658-large_default/calcetines-tecnicos-deportivos-monolon-comic.jpg"
    },
    {
        id: 6,
        name: "Calcetines de Bambú",
        price: 15.99,
        image: "https://product-images.weber.com/accessory-images/18418_studio_1800x1800.png?w=800&h=800&auto=compress%2Cformat"
    },
    {
        id: 7,
        name: "Calcetines Invisibles",
        price: 7.99,
        image: "https://www.libreriaoctubre.com/wp-content/uploads/2023/11/calcetines-navidenos-2-copia.png"
    },
    {
        id: 8,
        name: "Calcetines de Lana",
        price: 13.99,
        image: "https://verdedoncella.com/43242-large_default/calcetines-perro-salchicha-many-mornings.jpg"
    },
    {
        id: 9,
        name: "Calcetines de Harry Potter",
        price: 10.99,
        image: "https://latiendadeharrypotter.es/47536-large_default/calcetines-gryffindor-harry-potter.jpg"
    },
    {
        id: 10,
        name: "Calcetines Frikis",
        price: 16.99,
        image: "https://www.lacasadelfriki.es/47136-large_default/calcetines-amarillo-pikachu-pokemon.jpg"
    }
];


let cart = [];

const productsContainer = document.getElementById('products-container');
const cartItemsContainer = document.getElementById('cart-items');
const cartCount = document.getElementById('cart-count');
const cartTotal = document.getElementById('cart-total');
const themeToggle = document.getElementById('theme-toggle');
const loginModal = document.getElementById('login-modal');
const openLoginBtn = document.getElementById('open-login');
const closeLoginBtn = document.getElementById('close-login');
const cartSidebar = document.getElementById('cart-sidebar');
const openCartBtn = document.getElementById('open-cart');
const closeCartBtn = document.getElementById('close-cart');
const welcomePopup = document.getElementById('welcome-popup');
const closePopupBtn = document.getElementById('close-popup');

themeToggle.addEventListener('click', () => {
    const htmlElement = document.documentElement;
    const currentTheme = htmlElement.getAttribute('data-theme');
    const newTheme = currentTheme === 'light' ? 'dark' : 'light';

    htmlElement.setAttribute('data-theme', newTheme);
    themeToggle.textContent = newTheme === 'light' ? '🌙' : '☀️';
});


openLoginBtn.addEventListener('click', () => {
    loginModal.style.display = 'flex';
});

closeLoginBtn.addEventListener('click', () => {
    loginModal.style.display = 'none';
});

window.addEventListener('click', (event) => {
    if (event.target === loginModal) {
        loginModal.style.display = 'none';
    }
});


document.getElementById('login-form').addEventListener('submit', (e) => {
    e.preventDefault();
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;


    alert(`¡Inicio de sesión exitoso! Bienvenido, ${email}`);
    loginModal.style.display = 'none';
    openLoginBtn.textContent = 'Mi Cuenta';
});


openCartBtn.addEventListener('click', () => {
    cartSidebar.classList.add('open');
});

closeCartBtn.addEventListener('click', () => {
    cartSidebar.classList.remove('open');
});

setTimeout(() => {
    welcomePopup.style.display = 'block';
}, 2000);

closePopupBtn.addEventListener('click', () => {
    welcomePopup.style.display = 'none';
});

function loadProducts() {
    productsContainer.innerHTML = '';

    products.forEach(product => {
        const productElement = document.createElement('div');
        productElement.className = 'product-card';
        productElement.innerHTML = `
              <div class="product-img">
                  <img src="${product.image}" alt="${product.name}">
              </div>
              <div class="product-info">
                  <h3 class="product-title">${product.name}</h3>
                  <p class="product-price">€${product.price.toFixed(2)}</p>
                  <button class="add-to-cart" data-id="${product.id}">Añadir al Carrito</button>
              </div>
          `;

        productsContainer.appendChild(productElement);
    });


    document.querySelectorAll('.add-to-cart').forEach(button => {
        button.addEventListener('click', addToCart);
    });
}


function addToCart(event) {
    const productId = parseInt(event.target.getAttribute('data-id'));
    const product = products.find(p => p.id === productId);

    const existingItemIndex = cart.findIndex(item => item.id === productId);

    if (existingItemIndex !== -1) {
        cart[existingItemIndex].quantity += 1;
    } else {
        cart.push({
            ...product,
            quantity: 1
        });
    }

    updateCart();
    cartSidebar.classList.add('open');
}

function updateCart() {
    cartItemsContainer.innerHTML = '';

    if (cart.length === 0) {
        cartItemsContainer.innerHTML = '<p>Tu carrito está vacío</p>';
        cartCount.textContent = '0';
        cartTotal.textContent = '€0.00';
        return;
    }

    let total = 0;

    cart.forEach(item => {
        const itemTotal = item.price * item.quantity;
        total += itemTotal;

        const cartItemElement = document.createElement('div');
        cartItemElement.className = 'cart-item';
        cartItemElement.innerHTML = `
              <div class="cart-item-img">
                  <img src="${item.image}" alt="${item.name}">
              </div>
              <div class="cart-item-details">
                  <h4 class="cart-item-title">${item.name}</h4>
                  <p class="cart-item-price">€${item.price.toFixed(2)}</p>
                  <div class="cart-item-quantity">
                      <button class="quantity-btn minus" data-id="${item.id}">-</button>
                      <input type="number" class="quantity-input" value="${item.quantity}" min="1" data-id="${item.id}">
                      <button class="quantity-btn plus" data-id="${item.id}">+</button>
                  </div>
              </div>
              <button class="remove-item" data-id="${item.id}">&times;</button>
          `;

        cartItemsContainer.appendChild(cartItemElement);
    });

    cartCount.textContent = cart.reduce((sum, item) => sum + item.quantity, 0);
    cartTotal.textContent = `€${total.toFixed(2)}`;

    document.querySelectorAll('.minus').forEach(button => {
        button.addEventListener('click', decreaseQuantity);
    });

    document.querySelectorAll('.plus').forEach(button => {
        button.addEventListener('click', increaseQuantity);
    });

    document.querySelectorAll('.quantity-input').forEach(input => {
        input.addEventListener('change', updateQuantity);
    });

    document.querySelectorAll('.remove-item').forEach(button => {
        button.addEventListener('click', removeItem);
    });
}

function increaseQuantity(event) {
    const productId = parseInt(event.target.getAttribute('data-id'));
    const item = cart.find(item => item.id === productId);
    item.quantity += 1;
    updateCart();
}

function decreaseQuantity(event) {
    const productId = parseInt(event.target.getAttribute('data-id'));
    const item = cart.find(item => item.id === productId);

    if (item.quantity > 1) {
        item.quantity -= 1;
    } else {
        removeItem(event);
    }

    updateCart();
}

function updateQuantity(event) {
    const productId = parseInt(event.target.getAttribute('data-id'));
    const newQuantity = parseInt(event.target.value);

    if (newQuantity >= 1) {
        const item = cart.find(item => item.id === productId);
        item.quantity = newQuantity;
        updateCart();
    }
}

function removeItem(event) {
    const productId = parseInt(event.target.getAttribute('data-id'));
    cart = cart.filter(item => item.id !== productId);
    updateCart();
}

function startCountdown() {
    
    const countdownDate = new Date();
    countdownDate.setDate(countdownDate.getDate() + 7);


    const timer = setInterval(() => {
        const now = new Date().getTime();
        const distance = countdownDate - now;

        const days = Math.floor(distance / (1000 * 60 * 60 * 24));
        const hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        const minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
        const seconds = Math.floor((distance % (1000 * 60)) / 1000);

  
        document.getElementById('days').textContent = days.toString().padStart(2, '0');
        document.getElementById('hours').textContent = hours.toString().padStart(2, '0');
        document.getElementById('minutes').textContent = minutes.toString().padStart(2, '0');
        document.getElementById('seconds').textContent = seconds.toString().padStart(2, '0');

     
        if (distance < 0) {
            clearInterval(timer);
            document.getElementById('days').textContent = '00';
            document.getElementById('hours').textContent = '00';
            document.getElementById('minutes').textContent = '00';
            document.getElementById('seconds').textContent = '00';
        }
    }, 1000);
}


document.addEventListener('DOMContentLoaded', () => {
    loadProducts();
    updateCart();
    startCountdown();
});