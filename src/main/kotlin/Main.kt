fun main() {
    while (true) {

        /* Gets values of both numbers as Doubles */
        val x: Double = promptUserForValidNumber("Enter X value: ")
        val y: Double = promptUserForValidNumber("Enter Y value: ")

        /* Prints an answer as a Double or as an Integer if number is whole */
        println("X + Y is ${isWholeNumber(x + y)}")

        /* Gets user's answer regarding a restart and acts accordingly */
        val startOver: Boolean = promptUserForYesOrNo("Do you want to restart (Yes/No)? ")

        if (!startOver) break
    }
}

/* Function repeatedly prompts user for a valid number */
fun promptUserForValidNumber(message: String): Double {
    while (true) {
        print(message)
        val input = readln().toDoubleOrNull()

        if (input != null) {
            return input
        } else {
            println("Please enter a valid number!")
        }
    }
}

/*
 * Function repeatedly prompts user for a "Yes" or "No" answer
 * Returns Boolean value depending on the answer
 */
fun promptUserForYesOrNo(message: String): Boolean {
    while (true) {
        print(message)
        val input = readln()

        return when {
            input.startsWith('Y', ignoreCase = true) -> true
            input.startsWith('N', ignoreCase = true) -> false
            else -> {
                println("Please answer with \"Yes\" or \"No\"!")
                continue
            }
        }
    }
}

/* Function checks if a number is whole and returns Integer type in that case */
fun isWholeNumber(z: Double) = if (z % 1.0 == 0.0) z.toInt() else z