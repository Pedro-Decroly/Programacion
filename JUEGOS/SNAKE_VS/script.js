// Variables globales
let canvas, ctx;
let snake = [];
let food = {};
let direction = 'right';
let nextDirection = 'right';
let score = 0;
let gameInterval;
let gameSpeed = 100; // Velocidad del juego en ms
let gridSize = 20; // Tamaño de cada celda
let gameOver = false;

// Elementos del DOM
const startScreen = document.getElementById('start-screen');
const gameScreen = document.getElementById('game-screen');
const startButton = document.getElementById('start-button');
const restartButton = document.getElementById('restart-button');
const scoreElement = document.getElementById('score');

// Inicialización
startButton.addEventListener('click', startGame);
restartButton.addEventListener('click', restartGame);
document.addEventListener('keydown', changeDirection);

// Función para iniciar el juego
function startGame() {
    startScreen.style.display = 'none';
    gameScreen.style.display = 'block';
    
    canvas = document.getElementById('game-canvas');
    ctx = canvas.getContext('2d');
    
    initGame();
    gameInterval = setInterval(gameLoop, gameSpeed);
}

// Función para reiniciar el juego
function restartGame() {
    clearInterval(gameInterval);
    initGame();
    gameInterval = setInterval(gameLoop, gameSpeed);
}

// Inicialización del juego
function initGame() {
    // Reiniciar variables
    snake = [
        {x: 5*gridSize, y: 10*gridSize},
        {x: 4*gridSize, y: 10*gridSize},
        {x: 3*gridSize, y: 10*gridSize}
    ];
    
    direction = 'right';
    nextDirection = 'right';
    score = 0;
    gameOver = false;
    scoreElement.textContent = score;
    
    // Crear comida
    createFood();
}

// Ciclo principal del juego
function gameLoop() {
    if (gameOver) return;
    
    // Limpiar canvas
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    
    // Actualizar dirección
    direction = nextDirection;
    
    // Mover serpiente
    moveSnake();
    
    // Verificar colisiones
    if (checkCollision()) {
        gameOver = true;
        clearInterval(gameInterval);
        alert(`¡Juego terminado! Tu puntuación: ${score}`);
        return;
    }
    
    // Verificar si come
    if (snake[0].x === food.x && snake[0].y === food.y) {
        // Aumentar puntuación
        score += 10;
        scoreElement.textContent = score;
        
        // Crear nueva comida
        createFood();
        
        // No eliminar la cola para que crezca
    } else {
        // Eliminar último segmento si no come
        snake.pop();
    }
    
    // Dibujar elementos
    drawFood();
    drawSnake();
}

// Mover la serpiente
function moveSnake() {
    let newHead = {x: snake[0].x, y: snake[0].y};
    
    // Calcular nueva posición de la cabeza
    switch (direction) {
        case 'up':
            newHead.y -= gridSize;
            break;
        case 'down':
            newHead.y += gridSize;
            break;
        case 'left':
            newHead.x -= gridSize;
            break;
        case 'right':
            newHead.x += gridSize;
            break;
    }
    
    // Añadir nueva cabeza al inicio del array
    snake.unshift(newHead);
}

// Verificar colisiones
function checkCollision() {
    const head = snake[0];
    
    // Colisión con paredes
    if (
        head.x < 0 || 
        head.x >= canvas.width || 
        head.y < 0 || 
        head.y >= canvas.height
    ) {
        return true;
    }
    
    // Colisión consigo mismo
    for (let i = 1; i < snake.length; i++) {
        if (head.x === snake[i].x && head.y === snake[i].y) {
            return true;
        }
    }
    
    return false;
}

// Crear comida
function createFood() {
    // Posición aleatoria para la comida
    const maxX = (canvas.width / gridSize) - 1;
    const maxY = (canvas.height / gridSize) - 1;
    
    let foodX, foodY;
    let foodOnSnake;
    
    // Asegurarse de que la comida no aparezca en la serpiente
    do {
        foodOnSnake = false;
        foodX = Math.floor(Math.random() * maxX) * gridSize;
        foodY = Math.floor(Math.random() * maxY) * gridSize;
        
        for (let segment of snake) {
            if (segment.x === foodX && segment.y === foodY) {
                foodOnSnake = true;
                break;
            }
        }
    } while (foodOnSnake);
    
    food = {x: foodX, y: foodY};
}

// Dibujar la serpiente
function drawSnake() {
    ctx.fillStyle = '#4CAF50';
    
    for (let segment of snake) {
        ctx.fillRect(segment.x, segment.y, gridSize, gridSize);
        
        // Borde para cada segmento
        ctx.strokeStyle = 'black';
        ctx.strokeRect(segment.x, segment.y, gridSize, gridSize);
    }
    
    // Dibujar ojos en la cabeza
    const head = snake[0];
    ctx.fillStyle = 'white';
    
    // Posición de los ojos depende de la dirección
    if (direction === 'left' || direction === 'right') {
        // Ojos horizontales
        ctx.fillRect(head.x + 5, head.y + 5, 2, 2);
        ctx.fillRect(head.x + 5, head.y + 13, 2, 2);
    } else {
        // Ojos verticales
        ctx.fillRect(head.x + 5, head.y + 5, 2, 2);
        ctx.fillRect(head.x + 13, head.y + 5, 2, 2);
    }
}

// Dibujar la comida
function drawFood() {
    ctx.fillStyle = 'red';
    ctx.fillRect(food.x, food.y, gridSize, gridSize);
    
    // Borde para la comida
    ctx.strokeStyle = 'darkred';
    ctx.strokeRect(food.x, food.y, gridSize, gridSize);
}

// Cambiar dirección con teclado
function changeDirection(event) {
    const key = event.key;
    
    // Evitar que la serpiente se mueva en dirección opuesta
    if (key === 'ArrowUp' && direction !== 'down') {
        nextDirection = 'up';
    } else if (key === 'ArrowDown' && direction !== 'up') {
        nextDirection = 'down';
    } else if (key === 'ArrowLeft' && direction !== 'right') {
        nextDirection = 'left';
    } else if (key === 'ArrowRight' && direction !== 'left') {
        nextDirection = 'right';
    }
}