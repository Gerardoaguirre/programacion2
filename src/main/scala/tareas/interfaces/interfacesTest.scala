object interfacesTest
{
  trait PuedeHacerRuido
  {
    def hacerRuido(): String

  }
  var man = hacerRuido

  def main(args:Array[String])
  {
    println("Un perro puede hacer ruido" + man)
  }
}
