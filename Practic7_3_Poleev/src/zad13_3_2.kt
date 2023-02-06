fun  Zad13_3_2()
{
    try {
        println("введите значение k: ")
        var k = readLine()!!.toDouble()
        println("введите значение b: ")
        var b = readLine()!!.toDouble()
        println("введите значение a: ")
        var a = readLine()!!.toDouble()
        var x = 0.0
        var y = 0.0
        if (a == 0.0)
        {
            if(b == 0.0)
            {
                println("0,0")
            }
            else
            {
                x = -b / k
                println("$x, 0")
            }
        }
        else
            if(k == 0.0)
            {
                x = a / b
                println("$x , $b")
            }
            else
            {
                var d = b *b + 4 * k * a
                if (d > 0)
                {
                    x = -d - b / 2 * k
                    y =  k * x + b
                    println("$x, $y")
                    x = -d + b / 2 * k
                    y =  k * x + b
                    println("$x, $y")
                }
                else
                    if(d < 0)
                    {
                        println("Нет корней")
                    }
                    else
                    {
                        x = -b / 2 * k
                        println("$x" + k * x + b)
                    }
            }
    }
    catch (e: Exception)
    {
        println("Возникла ошибка")
    }
}
fun main()
{
    Zad13_3_2()
}