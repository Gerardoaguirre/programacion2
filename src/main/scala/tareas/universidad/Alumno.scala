package tareas.universidad
import com.github.nscala_time.time.Imports._
class Alumno(nom:String,nSegSoc:Int,Direccion:String
            sexo:String,fec.Nac:DateTime)
            {
  val alumno=Alumnos.conMatricul(matricula)
  val seccionesAlumno=Secciones.queCoincidenCon
                      (carrera,cuatrimestre,anio)
  for(i <- 0 to seccionesAlumno.lengh){
    println("["+i+"]" + seccionesAlumno(i).mostrar())

  }
  val seccion= new Seccion()
  val nota= new Nota(SeccionesAlumno(seccion))

}
