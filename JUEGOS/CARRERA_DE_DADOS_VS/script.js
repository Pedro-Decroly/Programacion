let playerScore = 0;
let cpuScore = 0;
let playerHistory = [];
let cpuHistory = [];
let gameDifficulty = "normal";
let dice = document.getElementById("dice");

function startGame() {
    document.getElementById("mainScreen").classList.remove("active");
    document.getElementById("gameScreen").classList.add("active");
    playerScore = 0;
    cpuScore = 0;
    playerHistory = [];
    cpuHistory = [];
    updateScores();
}

function rollDice() {
    dice.classList.add("rolling");

    setTimeout(() => {
        let playerRoll = Math.floor(Math.random() * 6) + 1;
        dice.textContent = getDiceEmoji(playerRoll);
        dice.classList.remove("rolling");

        playerScore += playerRoll;
        playerHistory.push(playerRoll);
        updateScores();
        checkWinner();

        let delay = gameDifficulty === "easy" ? 1000 : gameDifficulty === "normal" ? 1500 : 2000;

        setTimeout(() => {
            let cpuRoll = Math.floor(Math.random() * 6) + 1;
            dice.textContent = getDiceEmoji(cpuRoll);

            cpuScore += cpuRoll;
            cpuHistory.push(cpuRoll);
            updateScores();
            checkWinner();
        }, delay);
    }, 1000);
}

function getDiceEmoji(num) {
    return ["🎲", "⚀", "⚁", "⚂", "⚃", "⚄", "⚅"][num];
}

function updateScores() {
    document.getElementById("playerScore").textContent = playerScore;
    document.getElementById("cpuScore").textContent = cpuScore;
    document.getElementById("playerHistory").textContent = playerHistory.join(", ");
    document.getElementById("cpuHistory").textContent = cpuHistory.join(", ");
}

function checkWinner() {
    if (playerScore >= 20) alert("🏆 ¡Ganaste! 🎉");
    if (cpuScore >= 20) alert("💀 Jugador 2 gana... 😢");
}

function goHome() {
    location.reload();
}

function openRules() {
    document.getElementById("rulesModal").style.display = "flex";
}

function closeRules() {
    document.getElementById("rulesModal").style.display = "none";
}

function setDifficulty(difficulty) {
    gameDifficulty = difficulty;
}
function setDifficulty(difficulty) {
    gameDifficulty = difficulty;

    // Resetea todos los botones y resalta el seleccionado
    document.querySelectorAll('.difficulty-buttons .btn').forEach(btn => {
        btn.classList.remove('selected');
    });

    event.target.classList.add('selected');
}