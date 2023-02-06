import kotlin.math.*
fun Zad13_1_1()
{
    try {
        println("Введите координаты первой точки(x1, y1):")
        var x1 = readLine()!!.toDouble()
        var y1 = readLine()!!.toDouble()
        println("Введите координаты второй точки(x2, y2):")
        var x2 = readLine()!!.toDouble()
        var y2 = readLine()!!.toDouble()
        println("Введите координаты третьей точки(x3, y3):")
        var x3 = readLine()!!.toDouble()
        var y3 = readLine()!!.toDouble()
        var a = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0))
        var b = Math.sqrt(Math.pow(x3 - x2, 2.0) + Math.pow(y3 - y2, 2.0))
        var c = Math.sqrt(Math.pow(x3 - x1, 2.0) + Math.pow(y3 - y1, 2.0))
        var P = a + b + c
        var S = Math.sqrt(P/2 * (P/2 - a) * (P/2 - b) * (P/2 - c))
        println("Периметр = " + String.format("%.4f", P))
        println("Площадь = " + String.format("%.4f", S))
    }
    catch (e: Exception)
    {
        println("Возникла ошибка")
    }
}
fun main()
{
    Zad13_1_1()
}