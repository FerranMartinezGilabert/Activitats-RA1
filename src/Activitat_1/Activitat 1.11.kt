package Activitat_1//Program: Calculadora de volum d'aire.

import java.util.*

//Enunciat: Per poder fer un estudi de la ventilació d'una aula necessitem poder calcular la quantitat d'aire que hi cap en una habitació.
//Llegeix les 3 dimensions de l'aula i imprimeix per pantalla quin volum té.

fun main(){

    //Definim l'objecte Scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    //Demanem les 3 dimensions.
    var llargada : Double = scanner.nextDouble()
    var amplada : Double = scanner.nextDouble()
    var alzada : Double = scanner.nextDouble()

    //Ara calculem el volum de l'habitació.
    var volum : Double = llargada * alzada * amplada

    //Mostrem el resultat per pantalla.
    println(volum)
}