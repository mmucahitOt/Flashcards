fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    val swapedNumber = numbers[0]
    numbers[0] = numbers[numbers.size-1]
    numbers[numbers.size-1] = swapedNumber
    println(numbers.joinToString(separator = " "))
}