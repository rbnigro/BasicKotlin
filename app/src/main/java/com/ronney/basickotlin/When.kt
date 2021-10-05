package com.ronney.basickotlin

class When {
}

fun obterMnemonica(cor: Cor) =
    when (cor) {
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alghuém"
        Cor.VERDE -> "Viver"
        Cor.AZUL -> "Além é"
        Cor.LARANJA -> "Legal"
    }

fun obterTemporeatura(cor: Cor): String {
    return when(cor) {
        Cor.VERMELHO, Cor.LARANJA, Cor.AMARELO -> "Quente"
        Cor.VERDE -> "Neutra"
        Cor.AZUL -> "Fria"
    }
}
fun main() {
    val mnemonica = obterMnemonica(Cor.VERMELHO)
    println(mnemonica)

    val temperatura = obterTemporeatura(Cor.AMARELO)
    println(temperatura )
}