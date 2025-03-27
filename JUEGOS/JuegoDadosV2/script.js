document.addEventListener("DOMContentLoaded", () => {
    const tablero = document.getElementById("tablero");
    const dado = document.getElementById("dado");
    const lanzarBtn = document.getElementById("lanzar");
    const mensajeFinal = document.getElementById("mensaje-final");
    const reglasBtn = document.getElementById("reglas");
    const ventanaReglas = document.getElementById("ventana-reglas");
    const cerrarReglas = document.getElementById("cerrar-reglas");
    let posiciones = [0, 0];
    let turno = 0;
    const totalCasillas = 20;
    
    // Crear tablero
    for (let i = 0; i < totalCasillas; i++) {
        const casilla = document.createElement("div");
        casilla.classList.add("casilla");
        casilla.textContent = i + 1;
        tablero.appendChild(casilla);
    }
    const casillas = document.querySelectorAll(".casilla");
    
    function lanzarDado() {
        dado.classList.remove("oculto");
        let resultado = Math.floor(Math.random() * 6) + 1;
        dado.textContent = "?";
        setTimeout(() => {
            dado.textContent = resultado;
            moverJugador(resultado);
        }, 500);
    }
    
    function moverJugador(pasos) {
        posiciones[turno] += pasos;
        if (posiciones[turno] >= totalCasillas) {
            mensajeFinal.textContent = `¡Jugador ${turno + 1} ha ganado!`;
            mensajeFinal.classList.remove("oculto");
            lanzarBtn.disabled = true;
        }
        actualizarTablero();
        turno = turno === 0 ? 1 : 0;
    }
    
    function actualizarTablero() {
        casillas.forEach(c => c.innerHTML = "");
        posiciones.forEach((pos, index) => {
            if (pos < totalCasillas) {
                casillas[pos].innerHTML += `<div class='jugador' id='jugador${index + 1}'></div>`;
            }
        });
    }
    
    lanzarBtn.addEventListener("click", lanzarDado);
    reglasBtn.addEventListener("click", () => ventanaReglas.classList.remove("oculto"));
    cerrarReglas.addEventListener("click", () => ventanaReglas.classList.add("oculto"));
});
