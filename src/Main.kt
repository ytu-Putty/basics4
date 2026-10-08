//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    println("Введите операнд1 операнд2 и операцию через пробелы")
    val strings = readln().split(" ")
    val first = strings[0].toDoubleOrNull()
    val second = strings[1].toDoubleOrNull()
    val operation = strings[2]
    if (first == null || second == null) {
        println("Ошибка: операнды должны быть числами!")
        return
    }
    val result = when (operation)
    {
        "+" -> first + second
        "-" -> first - second
        "*" -> first * second
        "/" ->
        {
            if (second ==0.0)
            {
                println("Ошибка! на ноль делить нельзя!")
            }
            else first / second
        }
        else -> "Нет решения"
    }
    println(result)
}