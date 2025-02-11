
class Departamento(var empleados: Array<Empleado>) {

    fun obtenerSalarios() {
        for (i in empleados) {
            println("ID: ${i.id} | Nombre: ${i.nombre} | Salario: ${i.calculaSalario()}")
        }
    }

}