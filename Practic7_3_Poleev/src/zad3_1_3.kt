import kotlin.math.*
fun Zad3_3()
{
    try {
        println("Введите длину окружности")
        var L = readLine()!!.toDouble()
        while (true)
        {
            if (L > 0)
            {
                break
            }
            else
            {
                println("Введите длину окружности:")
                L = readLine()!!.toDouble()
            }
        }
        var R = L / (2 * Math.PI)
        var S = Math.PI * Math.pow(R, 2.0)

        println("Площадь круга: ")
        println(String.format("%.4f", S))
    }
    catch (e: Exception)
    {
        println("Возникла ошибка")
    }
}
fun main()
{
    Zad3_3()
}