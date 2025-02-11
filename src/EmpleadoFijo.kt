

class EmpleadoFijo(id: Int, nombre: String, val salarioFijo: Int) : Empleado(id, nombre) {

    companion object {
        val numPagas = 12
    }

    override fun calculaSalario(): Int {
        return salarioFijo * numPagas
    }

}