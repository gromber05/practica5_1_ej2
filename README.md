# Ejercicio 2: Sistema de Empleados y Departamentos

## Enunciado
Diseña una clase abstracta `Empleado` con propiedades como `nombre`, `id` y un método abstracto `calculaSalario()`.

Crea clases derivadas como `EmpleadoPorHora` y `EmpleadoFijo`, que implementen el método `calculaSalario()` de diferentes maneras.

Considera añadir una clase `Departamento` que tenga una lista de empleados y pueda calcular el salario total que se debe pagar a todos sus empleados.

### Detalles de implementación:

- `EmpleadoPorHora`
    - Propiedades: `horasTrabajadas` al mes y `tarifaPorHora`.
    - Calcula el salario mensual multiplicando estas propiedades.

- `EmpleadoFijo`
    - Propiedades: `salarioFijo` y `numPagas`.
    - Calcula el salario mensual dividiendo `salarioFijo` entre `numPagas`.

- `Departamento`
    - Contiene una lista de empleados.
    - Métodos:
        - `agregarEmpleado()`: Añade un empleado a la lista.
        - `calculaSalarioTotal()`: Calcula el salario total de todos sus empleados al mes.

### Ejemplo en el `main`

- Crear una instancia de `Departamento`.
- Agregar varios empleados.
- Recorrer la lista de empleados mostrando su información en el formato:  
