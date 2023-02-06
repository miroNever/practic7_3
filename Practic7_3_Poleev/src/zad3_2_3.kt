fun Zad3_2_3()
{
    try {
        println("Введите значение x:")
        var x = readLine()!!.toDouble()
        println("Введите значение y:")
        var y = readLine()!!.toDouble()
        println("Введите значение z:")
        var z = readLine()!!.toDouble()
        when
        {
            x < z -> println(Math.max(x, y))
            x >= z -> println(Math.min(x, y))
        }
    }
    catch (e: Exception)
    {
        println("Возникла ошибка")
    }
}
fun main()
{
    Zad3_2_3()
}