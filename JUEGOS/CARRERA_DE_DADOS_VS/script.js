// Configuración del juego
const gameConfig = {
    trackLength: 100,
    difficulty: 'easy',
    difficulties: {
        easy: { min: 1, max: 6 },
        medium: { min: 2, max: 7 },
        hard: { min: 3, max: 8 }
    },
    currentPlayer: 'human', // 'human' o 'cpu'
    gameOver: false
};

// Estado del juego
const gameState = {
    humanPosition: 0,
    cpuPosition: 0
};

// Referencias a elementos del DOM
const startScreen = document.getElementById('startScreen');
const rulesScreen = document.getElementById('rulesScreen');
const gameScreen = document.getElementById('gameScreen');
const startButton = document.getElementById('startButton');
const rulesButton = document.getElementById('rulesButton');
const backButton = document.getElementById('backButton');
const returnToMenuButton = document.getElementById('returnToMenuButton');
const rollButton = document.getElementById('rollButton');
const difficultyButtons = document.querySelectorAll('.difficulty-btn');

const humanPlayer = document.getElementById('humanPlayer');
const cpuPlayer = document.getElementById('cpuPlayer');
const humanPlayerCard = document.getElementById('humanPlayerCard');
const cpuPlayerCard = document.getElementById('cpuPlayerCard');
const humanPositionElement = document.getElementById('humanPosition');
const cpuPositionElement = document.getElementById('cpuPosition');
const diceElement = document.getElementById('dice');
const gameMessage = document.getElementById('gameMessage');
const raceTrack = document.getElementById('raceTrack');

// Event Listeners
startButton.addEventListener('click', startGame);
rulesButton.addEventListener('click', showRules);
backButton.addEventListener('click', showStartScreen);
returnToMenuButton.addEventListener('click', showStartScreen);
rollButton.addEventListener('click', playerRoll);

// Configuración de dificultad
difficultyButtons.forEach(button => {
    button.addEventListener('click', () => {
        difficultyButtons.forEach(btn => btn.classList.remove('active'));
        button.classList.add('active');
        gameConfig.difficulty = button.getAttribute('data-difficulty');
    });
});

// Funciones del juego
function showStartScreen() {
    startScreen.classList.remove('hidden');
    rulesScreen.classList.add('hidden');
    gameScreen.classList.add('hidden');
    resetGame();
}

function showRules() {
    startScreen.classList.add('hidden');
    rulesScreen.classList.remove('hidden');
    gameScreen.classList.add('hidden');
}

function startGame() {
    startScreen.classList.add('hidden');
    rulesScreen.classList.add('hidden');
    gameScreen.classList.remove('hidden');
    resetGame();
    updateGameUI();
}

function resetGame() {
    gameState.humanPosition = 0;
    gameState.cpuPosition = 0;
    gameConfig.currentPlayer = 'human';
    gameConfig.gameOver = false;
    
    // Restablecer UI
    updatePlayerPositions();
    gameMessage.textContent = '¡Lanza el dado para comenzar!';
    gameMessage.classList.remove('winner-message');
    rollButton.disabled = false;
    
    // Actualizar tarjetas de jugadores
    updatePlayerTurn();
}

function updateGameUI() {
    // Actualizar las posiciones visualmente
    updatePlayerPositions();
    
    // Actualizar elementos de texto
    humanPositionElement.textContent = gameState.humanPosition;
    cpuPositionElement.textContent = gameState.cpuPosition;
    
    // Actualizar indicador de turno
    updatePlayerTurn();
}

function updatePlayerTurn() {
    const humanIndicator = humanPlayerCard.querySelector('.active-indicator');
    const cpuIndicator = cpuPlayerCard.querySelector('.active-indicator');
    
    if (gameConfig.currentPlayer === 'human') {
        humanPlayerCard.classList.add('active');
        cpuPlayerCard.classList.remove('active');
        humanIndicator.classList.remove('hidden');
        cpuIndicator.classList.add('hidden');
    } else {
        humanPlayerCard.classList.remove('active');
        cpuPlayerCard.classList.add('active');
        humanIndicator.classList.add('hidden');
        cpuIndicator.classList.remove('hidden');
    }
}

function updatePlayerPositions() {
    const trackWidth = raceTrack.clientWidth - 60; // Restamos el tamaño del jugador
    
    // Calculamos la posición en píxeles basada en la proporción
    const humanPixelPosition = (gameState.humanPosition / gameConfig.trackLength) * trackWidth;
    const cpuPixelPosition = (gameState.cpuPosition / gameConfig.trackLength) * trackWidth;
    
    // Actualizamos las posiciones CSS
    humanPlayer.style.left = `${humanPixelPosition}px`;
    cpuPlayer.style.left = `${cpuPixelPosition}px`;
}

function rollDice(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

function animateDice() {
    diceElement.classList.add('shake');
    setTimeout(() => {
        diceElement.classList.remove('shake');
    }, 500);
}

function playerRoll() {
    if (gameConfig.gameOver) return;
    
    const diceValue = rollDice(1, 6);
    animateDice();
    
    // Mostrar el valor del dado después de la animación
    setTimeout(() => {
        diceElement.textContent = diceValue;
        gameState.humanPosition += diceValue;
        humanPositionElement.textContent = gameState.humanPosition;
        gameMessage.textContent = `Has sacado un ${diceValue} y avanzas a la posición ${gameState.humanPosition}.`;
        
        updateGameUI();
        
        // Comprobar si el jugador ha ganado
        if (gameState.humanPosition >= gameConfig.trackLength) {
            endGame('human');
            return;
        }
        
        // Cambiar al turno de la CPU
        gameConfig.currentPlayer = 'cpu';
        updatePlayerTurn();
        rollButton.disabled = true;
        
        // La CPU juega después de un breve retraso
        setTimeout(cpuRoll, 1500);
    }, 500);
}

function cpuRoll() {
    if (gameConfig.gameOver) return;
    
    const diffSettings = gameConfig.difficulties[gameConfig.difficulty];
    const diceValue = rollDice(diffSettings.min, diffSettings.max);
    animateDice();
    
    // Mostrar el valor del dado después de la animación
    setTimeout(() => {
        diceElement.textContent = diceValue;
        gameState.cpuPosition += diceValue;
        cpuPositionElement.textContent = gameState.cpuPosition;
        gameMessage.textContent = `El Jugador2 ha sacado un ${diceValue} y avanza a la posición ${gameState.cpuPosition}.`;
        
        updateGameUI();
        
        // Comprobar si la CPU ha ganado
        if (gameState.cpuPosition >= gameConfig.trackLength) {
            endGame('cpu');
            return;
        }
        
        // Cambiar al turno del jugador
        gameConfig.currentPlayer = 'El Jugador2';
        updatePlayerTurn();
        rollButton.disabled = false;
    }, 500);
}

function endGame(winner) {
    gameConfig.gameOver = true;
    rollButton.disabled = true;
    gameMessage.classList.add('winner-message');
    
    if (winner === 'El Jugador1') {
        gameMessage.textContent = '¡Felicidades! Has ganado la carrera.';
    } else {
        gameMessage.textContent = 'El Jugador2 ha ganado la carrera. ¡Inténtalo de nuevo!';
    }
}

// Inicialización del juego
showStartScreen();