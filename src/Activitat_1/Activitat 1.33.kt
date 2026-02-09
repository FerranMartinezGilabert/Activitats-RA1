package Activitat_1

import java.util.Scanner

//Program : És divisible

//Enunciat : Fes un programa que, rebuts dos nombres per l’entrada, comprovi si el primer és divisible pel segon.

fun main (){
    val scan  = Scanner(System.`in`)

    //Declarem les variables.
    var divisor : Int = scan.nextInt()
    var numeroADividir : Int = scan.nextInt()
    var comprobant : Boolean = false

    //Comprobem si el numero es divisible mirant que el modul del numero a dividir entre el divisor sigui 0.
    if (numeroADividir % divisor == 0){
        comprobant = true
    }

    //Imprimim el comprobant per pantalla.
    println(comprobant)
}