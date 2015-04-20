package tareas.universidad
class Asignaturas {
    val asignaturas: Array[Asignatura](30)
    var temp = 0
    def agrega(asignatura: Asignatura) = {
        Asignaturas(temp) = asignatura
       temp = temp + 1
    }
    def DelaCarrera(carrera:String): Array[Asignatura] = {
    }

}
