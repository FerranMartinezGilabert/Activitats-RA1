package Activitat_2

import java.util.Scanner

//Program : És un bitllet vàlid ?

//Enunciat : L'usuari escriu un enter i s'imprimeix true si existeix un bitllet d'euros amb la quantitat entrada,
// false en qualsevol altre cas.

fun main(){
    val scanner = Scanner(System.`in`)

    //Declarem les variables.
    val BITLLET : Int = scanner.nextInt()
    val BITLLETSENEUROS : Array<Int> = arrayOf(5, 10, 20, 50, 100, 200, 500)
    var comprobant : Boolean = false

    //Comprobem si existeix el bitllet.
    for (i in 0 until BITLLETSENEUROS.size) {
        if (BITLLET == BITLLETSENEUROS[i]) {
            comprobant = true
        }
    }

    //Imprimim el resultat per pantalla.
    println(comprobant)

}