
open class Product(val productType: String, val price: Int)

class TaxedProduct(type: String, price: Int): Product(type, price) {
    var tax = 0.0

    init {
        tax = when (type) {
            "headphones" -> 0.11
            "smartphones" ->0.15
            "tv" -> 0.17
            "laptop" -> 0.19
            else -> 0.0
        }
    }

    fun totalCost():Int {
        return (price + price * tax).toInt()
    }
}



fun main() {
    val productType = readLine()!!
    val price = readLine()!!.toInt()
    val product = TaxedProduct(productType, price = price)
    println(product.totalCost())
}
