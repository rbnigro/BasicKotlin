package com.ronney.basickotlin


fun main() {
    // ArrayList - Classe
    val frutas1 = ArrayList<String>()
    frutas1.add("Maçã")
    frutas1.add("Banana")
    frutas1.add("Morango")
    println(frutas1)

    // ArrayList - Função
    val frutas2 = arrayListOf("Maçã", "Banana", "Morango")
    // println(frutas2)
    println(arrayListOf("Maçã", "Banana", "Morango"))

    println(HashSet::class.java)

    println(frutas2.last())

    val numeros = setOf(1, 14, 2)
    println(numeros.max())
}
