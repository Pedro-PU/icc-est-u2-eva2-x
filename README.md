
##  Evaluación: Estructuras de Datos con Set y Map y logica de arboles

### Objetivo

Implementar la funcionalidad solicitada en la clase `LibroController` para ordenar y gestionar objetos de tipo `Book` utilizando colecciones que mantengan un orden definido.

---

## 🧩 Modelo

Clase: `models.Book`

### 📑 Atributos

| Atributo | Tipo   | Descripción        |
| -------- | ------ | ------------------ |
| `titulo` | String | Título del libro   |
| `autor`  | String | Autor del libro    |
| `anio`   | int    | Año de publicación |

### 🧠 Consideraciones de ordenamiento

Los libros deben estar **ordenados primero por título en orden descendente** y, en caso de empate, por año de publicación en orden ascendente. En caso de que dos libros tengan el mismo título y año, se considerarán duplicados y no deben incluirse en el resultado final.

---

## Controlador

Clase: `controllers.LibroController`

---

###  Método: `procesarLibros(List<Book> libros)`

🔹 **Objetivo**: Implementar este método para que retorne un conjunto ordenado de libros, eliminando duplicados según el criterio de orden.

🔸 **Tipo de retorno**: `Set<Book>`

💡 **Pista**: la estructura elegida debe garantizar orden automático y evitar duplicados según el criterio de orden.


---

## 📌 Instrucciones

1. Clona el repositorio del proyecto desde GitHub.
2. Sube el proyecto a tu repositorio personal y el enlace al AVAC.
3. Implementa correctamente el método en la clase `LibroController`.
4. Sube el proyecto a tu repositorio correctamente.

---

## 📦 Evaluación Automática

El sistema usará GitHub Actions para compilar y ejecutar los tests automáticamente.
Recuerda que cada test aprobado sumará a tu nota final.

---

## ✅ Criterios de Evaluación

| Criterio                             | Puntos    |
| ------------------------------------ | --------- |
| `procesarLibros` funcional           | 10.0      |
| Tests ejecutan sin errores           | Requisito |
| Nota final calculada automáticamente | -         |

DEBERA EJECUTAR con el listado DESDE APP.java.


<img width="648" height="600" alt="image" src="https://github.com/user-attachments/assets/e1d59055-00c3-45df-80fb-b823fc80ee3c" />

<img width="1435" height="196" alt="image" src="https://github.com/user-attachments/assets/2843c897-cae4-4a87-999e-96c3ed37a228" />