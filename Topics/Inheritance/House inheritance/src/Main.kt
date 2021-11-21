import kotlin.reflect.typeOf

fun main() {
    val myHouse = House(5, "apartment")
    myHouse.getInfo()
    println(myHouse.hi)
}

open class Dwelling(val rooms: Int) {
    open fun getInfo(): Int{
        println("Number of rooms: $rooms")
        return rooms
    }
}

class House(rooms: Int, val type: String): Dwelling(rooms) {
    val hi = super.getInfo()
}