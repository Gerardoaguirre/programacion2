class Polinomio(g: Int)
{
  private val terminos = Array [Termino](g+1)
  private val grado=g

  def agregarTermino(c:Float,e:Int)={
    val termino=new Termino(c,e)
    if (terminos(e-1) != null){
      terminos(e-1) = terminos(e-1).reducir(termino)
    }
    else{
      terminos(e-1) = termino
    }
  }

  def agregarTermino(t:Termino)={
    if (terminos(t.grado())!=null){
      terminos(t.grado())=terminos(t.grado().reducir(t))
    }
    else{
      terminos(t.grado())=t
    }
  }

  def evaluar (x:Float): Float= {       //metodo
    var resultado:Float= 0
    for (termino <- terminos)
    {
      if (termino!=null){
      }
      resultado=resultado + termino.evaluar (x)
    }
    resultado
  }

  def mostrar(): String={
    var polinomio= ""

    for (i <- 0 to grado - 2){
    if (terminos(i)!=null){
      polinomio= polinomio + terminos(i).mostrar() + "+"
        }
      }
      polinomio + terminos(grado - 1).mostrar()
  }

  def sumar (b:Polinomio): Polinomio={
    var g:Int= 0
    val menor: new Polinomio (0)
    val mayor: new Polinomio (0)
    if(this.grado >= b.grado){
      g= this.grado
      menor=b
      mayor=this
    }
    else{
      g= b.grado
      menor= this
      mayor= b
    }
    var resultado= new Polinomio(0)
    for (i <- 0 to menor.grado){
      if(menor.terminos(i)!= null && mayor.terminos(i)== null){
        resultado.agregarTermino(menor.terminos(i))
      }
      else if(menor.terminos(i)==null && mayor.terminos(i)!= null){
        resultado.agregarTermino(mayor.terminos(i))
      }
      else if(menor.terminos(i)!= null && mayor.terminos(i)!=null){
        resultado.agregarTermino(menor.terminos(i).reducir)
      }
    }
    for (i <- menor.grado to mayor.grado -1){
      if(mayor.terminos(i)!= null){
        resultado.agregarTermino(mayor.terminos(i))
      }
    }
    resultado
  }

}
