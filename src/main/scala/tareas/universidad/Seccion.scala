package tareas.universidad

class Seccion(asignatura:Asignatura,grupo:Int,
              profesor:Profesor,cuatrimestre:String,anio:Int)
              {
  val secciones=new Array [seccion](this.secciones.length)
  for(seccion <- this secciones){
    if (seccion.ofertadaEn(carrera,anio,cuatrimestre))
  }
}
