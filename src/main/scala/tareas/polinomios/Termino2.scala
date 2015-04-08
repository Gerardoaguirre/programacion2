class Termino (c:Float, e:Int)
{
  private val coeficiente=c
  private val exponente= e

  def evaluar(x:Float):Float={
    var resultado:Float = 1
    for (i <- 1 to exponente){
      resultado=resultado * x
    }
  coeficiente*resultado
  }

  def tieneMismoGrado (t:Termino): Boolean ={
    this.exponente == t.exponente
  }

  def reducir (t: Termino): Termino={
  if (tieneMismoGrado(t)){
    return new Termino(
      this.coeficiente + t.coeficiente,
      this.exponente
    )
    }
    t
  }

  def esIgual(t: Termino): Boolean={
    this.coeficiente == t.coeficiente && this.exponente
  }

  def mostrar() : String = {
    coeficiente + "x^" + exponente
  }
}
