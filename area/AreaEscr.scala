class escribe {
    def mostrarAreas(figuras: Array[Area]): String = {
        var f = ""
        for (figura <- figuras) {
            f = f + figura.calcular()
        }
        f
    }
}
