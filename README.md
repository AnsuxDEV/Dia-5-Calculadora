# 🧮 Proyecto 5 – Calculadora Básica

## 📌 Descripción
Este proyecto consiste en una calculadora interactiva en consola que permite realizar operaciones matemáticas básicas y algunas avanzadas. El usuario selecciona la operación desde un menú y proporciona los números necesarios. El programa muestra el resultado y espera a que el usuario pulse **Enter** antes de continuar, ofreciendo una experiencia clara y ordenada.

---

## 🧱 Funcionalidades
  - Menú principal con opciones de cálculo:  
  - Suma  
  - Resta  
  - Multiplicación  
  - División (con validación de división por cero)  
  - Potencia  
  - Raíz cuadrada (con validación de números negativos)  
  - Entrada de datos con validación básica.  
  - Pausa tras cada cálculo para que el usuario pueda leer el resultado.  
  - Opción de salir del programa desde el menú.  

---

## 🧠 Aprendizajes
- Uso de **`Scanner`** para entrada de datos.  
- Control de flujo con **`switch`** y validación de opciones.  
- Modularización del código mediante **métodos** (`operarDosNumeros`, `operarUnNumero`).  
- Validación de casos especiales (división por cero, raíz cuadrada de negativos).  
- Implementación de pausas con `nextLine()` para mejorar la interacción.  

---

## ▶️ Ejemplo de ejecución
```
---------¡Bienvenido! Elija el cálculo que quiere realizar---------
1 - Suma
2 - Resta
3 - Multiplicación
4 - División
5 - Potencia
6 - Raíz cuadrada
7 - Salir
Seleccione una opción: 1
Introduce el primer número: 5
Introduce el segundo número: 7
El resultado es: 12
Pulse 'Enter' para continuar...
```

---

## 📌 Próximos pasos

- Añadir más operaciones (ej. módulo `%`).  
- Mejorar la interfaz con mensajes más descriptivos.  
- Implementar un historial de cálculos guardado en archivo.  
- Extender la calculadora con funciones trigonométricas (seno, coseno, tangente).  

---
