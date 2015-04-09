object areaTest {
    def main(args: Array[String]) {
        val circulo = new Circulo()
        val rectangulo = new Rectangulo()

      //  rectangulo.cambiarColor("rojo")

        val escribe = new escribe()
        println(escribe.mostrarAreas(
            Array(circulo, rectangulo)
        ))
    }
}
