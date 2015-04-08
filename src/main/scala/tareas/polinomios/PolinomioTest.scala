object PolinomioTest
{
  def main (args:Array[String])
  {
    var polinomio = new Polinomio(3)
    polinomio.agregarTermino(2,3)
    esVerdadero(
      polinomio.evaluar(2)==16,
        "2x^3 deberia ser 16 si x=2"
    )
    polinomio.agregarTermino(5,1)
    esVerdadero(
      polinomio.evaluar(2)==26,
        "5x+2x^3 deberia ser 26 si x=2"
    )
    polinomio.agregarTermino(3,3)
    esVerdadero(
      polinomio.mostrar()=="5x + 5x^3",
        "5x+2x^3 deberia ser 26 si x=2"
    )

    val b= new Polinomio(2)
    b.agregarTermino(3,0)
    b.agregarTermino(5,1)
    val suma= polinomio.suma(b)
    esVerdadero(
      suma.mostrar()=="3.0x^0 + 10.0x^1 + 5.0x^3",
        "El resultado deberia ser 3.0x^0 + 10.0x^1 + 5.0x^3"
    )

  }

  def esVerdadero (resultado: Boolean,mensaje:String){
  if (!resultado){
    println(mensaje)
    }
  }
}
