fun main() {
    var itemCosts = mapOf("Bread" to 50)
    var shoppingList = listOf("Bread")
    itemCosts+=("Milk" to 20)
    itemCosts+=("Meat" to 150)
    shoppingList+= ("Milk")
    shoppingList+= ("Meat")
    var totalCosts = 0
    for (item in shoppingList) {
        val itemCos = itemCosts[item]
        if (itemCos != null) {
            totalCosts += itemCos
        }
    }


    println("Total Cost = $totalCosts")




}
