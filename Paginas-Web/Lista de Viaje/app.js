// Clase para gestionar las tareas
class GestorTareasViaje {
    constructor() {
        this.tareas = [];
        this.cargarTareas();
        this.configurarEventos();
    }

    // Cargar tareas desde localStorage
    cargarTareas() {
        const tareasGuardadas = localStorage.getItem('tareasViaje');
        this.tareas = tareasGuardadas ? JSON.parse(tareasGuardadas) : [];
        this.mostrarTareas();
    }

    // Guardar tareas en localStorage
    guardarTareas() {
        localStorage.setItem('tareasViaje', JSON.stringify(this.tareas));
    }

    // Agregar nueva tarea
    agregarTarea(textoTarea) {
        const tarea = {
            id: Date.now(),
            texto: textoTarea,
            completada: false,
            fechaCreacion: new Date()
        };
        
        this.tareas.push(tarea);
        this.guardarTareas();
        this.mostrarTareas();
        this.mostrarFeedback('¡Tarea agregada con éxito!', 'success');
    }

    // Eliminar tarea
    eliminarTarea(idTarea) {
        this.tareas = this.tareas.filter(tarea => tarea.id !== idTarea);
        this.guardarTareas();
        this.mostrarTareas();
        this.mostrarFeedback('¡Tarea eliminada!', 'success');
    }

    // Alternar estado de completado
    alternarCompletado(idTarea) {
        const tarea = this.tareas.find(tarea => tarea.id === idTarea);
        if (tarea) {
            tarea.completada = !tarea.completada;
            this.guardarTareas();
            this.mostrarTareas();
            this.mostrarFeedback(
                tarea.completada ? '¡Tarea completada!' : '¡Tarea pendiente!',
                'success'
            );
        }
    }

    // Mostrar todas las tareas
    mostrarTareas() {
        const listaTareas = document.getElementById('taskList');
        listaTareas.innerHTML = '';

        this.tareas.forEach(tarea => {
            const li = document.createElement('li');
            li.className = `task-item ${tarea.completada ? 'completed' : ''}`;
            
            li.innerHTML = `
                <span class="task-content">${tarea.texto}</span>
                <div class="task-actions">
                    <button class="complete-btn" data-id="${tarea.id}">
                        ${tarea.completada ? 'Deshacer' : 'Completar'}
                    </button>
                    <button class="delete-btn" data-id="${tarea.id}">Eliminar</button>
                </div>
            `;
            
            listaTareas.appendChild(li);
        });
    }

    // Mostrar mensaje de feedback
    mostrarFeedback(mensaje, tipo) {
        const feedback = document.getElementById('feedback');
        feedback.textContent = mensaje;
        feedback.className = `feedback ${tipo}`;
        feedback.style.display = 'block';

        setTimeout(() => {
            feedback.style.display = 'none';
        }, 3000);
    }

    // Configurar eventos
    configurarEventos() {
        const formularioTareas = document.getElementById('taskForm');
        const listaTareas = document.getElementById('taskList');

        formularioTareas.addEventListener('submit', (e) => {
            e.preventDefault();
            const inputTarea = document.getElementById('taskInput');
            const textoTarea = inputTarea.value.trim();

            if (textoTarea) {
                this.agregarTarea(textoTarea);
                inputTarea.value = '';
            } else {
                this.mostrarFeedback('¡Por favor, ingresa una tarea!', 'error');
            }
        });

        listaTareas.addEventListener('click', (e) => {
            if (e.target.matches('.delete-btn')) {
                const idTarea = Number(e.target.dataset.id);
                this.eliminarTarea(idTarea);
            } else if (e.target.matches('.complete-btn')) {
                const idTarea = Number(e.target.dataset.id);
                this.alternarCompletado(idTarea);
            }
        });
    }
}
// Inicializar el gestor de tareas
const gestorTareas = new GestorTareasViaje();