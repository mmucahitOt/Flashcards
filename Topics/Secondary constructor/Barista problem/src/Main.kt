class EspressoMachine {
    val costPerServing: Float

    constructor(coffeeCapsulesCount: Int, totalCost: Float) {
        costPerServing = totalCost / coffeeCapsulesCount
    }

    constructor(coffeeBeansWeight: Float, totalCost: Float, beansWeightPerService: Int = 10) {
        costPerServing = totalCost / (coffeeBeansWeight / beansWeightPerService)
    }
}