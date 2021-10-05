package com.ronney.basickotlin

fun main() {
    var temperatura: Int
    var somatoria: Int = 0
    var quantidade: Int = 0

    do {
        println("Digite uma temperatura, ou 999 para sair: ")
        temperatura = readLine()!!.toInt()

        if (temperatura != 999) {
            somatoria += temperatura
            quantidade++
        }
    } while (temperatura != 999)

    println("A média das [$quantidade] temperaturas é = ${somatoria / quantidade}")
}