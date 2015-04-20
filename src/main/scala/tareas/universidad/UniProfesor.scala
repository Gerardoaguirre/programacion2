package tareas.universidad
import com.github.nscala_time.time.Imports._
class Profesor (nom:String,nSegSoc: Int,direccion:String,sexo:String
                fec.Nac: DateTime, categ:String,despacho:Int,extens:Int,
                salario: Float)
                extends Presona(nom:String,nSegSoc:String,direccion:String,
                sexo:String fec.Nac:Date Time)
                {
  private val departamento:Departamento=null

  def asignarADepartamento(d:Departamento){
    Departamento=d
    }

  val profesor=new Profesor(nom,nSegSoc,direccion,
                            sexo,carrera,categ,despacho,
                            extension,salario)
  profesores.agregar(Profesor)
  println("Agregar a departamento")
  val sn=readChar()
  if (sn=='s')
  val d=readInt
  Profesores() <- d
  Profesor.asignarADepartamento(departamentos(d))
  }
