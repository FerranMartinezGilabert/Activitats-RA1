package Activitat_2

import java.util.Scanner

//Program : En rang

//Enunciat : Escriu un programa que llegeixi 5 enters. El primer i el segon creen un rang, el tercer i el quart
// creen un altre rang. Mostra true si el cinquè valor està entre els dos rangs, si no false.

fun main (){
    val scan  = Scanner(System.`in`)

    //Declarem les variables.
    val PRIMER : Int = scan.nextInt()
    val SEGON : Int = scan.nextInt()
    val TERCER : Int = scan.nextInt()
    val QUART : Int = scan.nextInt()
    val CINC : Int = scan.nextInt()
    var comprobant : Boolean = false

    //Calculem el rang.
    if (CINC in PRIMER..SEGON && CINC in TERCER..QUART){
        comprobant = true
    }

    //Imprimim resultat.
    println(comprobant)
}