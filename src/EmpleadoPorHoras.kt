

class EmpleadoPorHoras(id: Int, nombre: String, val salario: Int, val tarifaPorHora: Int) : Empleado(id, nombre) {

    companion object {
        val horasTrabajadas = 160
    }

    override fun calculaSalario(): Int {
        return horasTrabajadas * tarifaPorHora
    }

}