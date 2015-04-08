
object PersonaTest extends App {
  //def main(args:Array [String])
  {
  val gerardo = new Person( new DateTime(1995, 11, 22, 0, 0))
  println(gerardo.fecNac.toString("dd-MM-yyyy"))
}
