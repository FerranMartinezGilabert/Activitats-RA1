package Activitat_2

import java.util.Scanner

//Program: Calculadora

//Enunciat: Fes un programa que, donat dos numeros enters i un símbol d'operacio, executi l'operacio i retorni el resultat

fun main (){
    val scanner = Scanner(System.`in`)

    val nombreEnter1 : Int = scanner.nextInt()
    val nombreEnter2 : Int = scanner.nextInt()

    val operador : String = scanner.next()

    when (operador) {
        "+" -> println(nombreEnter1+nombreEnter2)
        "-" -> println(nombreEnter1 - nombreEnter2)
        "*" -> println(nombreEnter1 * nombreEnter2)
        "/" -> println(nombreEnter1 / nombreEnter2)
        "%" -> println(nombreEnter1 % nombreEnter2)
    }
}