package com.ronney.basickotlin

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {
    try {
        println(porcentagem(500))
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    println(lerIdade())
}

fun porcentagem(numero: Int): String {
    return if (numero in 1..100) {
        "$numero%"
    } else {
        throw IllegalArgumentException("[$numero] Deve estar entre 1 e 100")
    }
}

fun lerIdade(): Int? {
    val path =
        "C:\\AndroidStudio\\Workspace\\BasicKotlin\\app\\src\\main\\java\\com\\ronney\\basickotlin\\idades.txt"
    val reader =
        FileReader(File(path))
    val buffer = BufferedReader(reader)

    val numero = buffer.readLine()
    try {
        return Integer.parseInt(numero)
    } catch (e: NumberFormatException) {
        println("Erro: " + e.message)
        return null
    } finally {
        buffer.close()
    }
}