fun main() {

// a, b, c represent variable Int values. Insert in function to utilize.

    val result = evenlySpaced(2,4,5)
    println(result)

}

fun evenlySpaced(a: Int = 0, b: Int = 0, c: Int = 0): Boolean {

//Where maxNumber is to get the number with the highest value of three numbers.

    val maxNumber: Int = if (a > b) {
        if (a > c)
            a
        else c
    } else {
        if (b > c)
            b
        else c
    }
//Where minNumber is to get the number with the lowest value of three numbers.

    val minNumber: Int = if (a < b) {
        if (a < c)
            a
        else c
    } else {
        if (b < c)
            b
        else c
    }

/*Where medNumber is to get the number that is in between the highest
value and the lowest value of the three numbers
 */

    val medNumber: Int = if (a != maxNumber) {
        if (a != minNumber)
            a else b
    } else {
        (b != maxNumber)
        if (b != minNumber)
            b else c
    }

// Checks if the values are evenly spaced.

    return (maxNumber - medNumber == medNumber - minNumber)

}

