package com.ronney.basickotlin

fun fizzBuzz(numero: Int) = when {
    numero % 15 == 0 -> "FizzBuz "
    numero % 3 == 0 -> "Fizz "
    numero % 5 == 0 -> "Buzz "
    else -> "${numero}"
}

fun main() {
    for (numero in 1..100) {
        println(fizzBuzz(numero))
    }
}