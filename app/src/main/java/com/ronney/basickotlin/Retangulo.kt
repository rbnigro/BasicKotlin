package com.ronney.basickotlin

class Retangulo(val altura: Int, val largura: Int) {

    val isQuadrado get() = altura == largura

}

fun main() {
    val retangulo : Retangulo = Retangulo(5,5)
    println(retangulo.isQuadrado)
}