fun main() {
    var itemCosts = mapOf("Bread" to 50)
    var shoppingList = listOf("Bread")
    var totalCosts = 0
    for (item in shoppingList) {
        val itemCos = itemCosts[item]
        if (itemCos != null) {
            totalCosts += itemCos
        }
    }


    println("Total Cost = $totalCosts")




}
