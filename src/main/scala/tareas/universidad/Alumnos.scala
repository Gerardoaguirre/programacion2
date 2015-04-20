package tareas.universidad

class Alumnos()
{
  val alumnos:Array [Alumnos](50)
  var otro=0
  def agregar(alumno:Alumnos){
  if (otro < 50){
    alumnos(otro)=alumno
    otro <- otro + 1
  }
  }
}
