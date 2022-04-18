fun main() {
    // lists are like dynamic arrays

    //there is mutable list and immutable lists
    // var which can be reassigned - val which cannot be reassigned

// immutable List
    var listOne = listOf(1, 2, 3, 4, 5)
//     listOne.add(7)
    println(listOne)


    // mutable Lists
    var listTwo = mutableListOf(1, 2, 3, 4, 5)
    listTwo.add(7)
    listTwo[0] = 50
    println(listTwo)
    println(listTwo[3])
    println(listTwo[4])
    listTwo.remove(3)
    println(listTwo)
    println(
        listTwo.contains(50)
    )

    val element = listTwo.filter { num ->
        num % 2 == 0
    }
    println(element)

    val newList = listTwo.map {
        it + it // the square each item in a list
    }
    println(newList)


}


