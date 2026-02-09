package Activitat_1//Program : Descompte en %

import java.util.*

//Enunciat : Llegeix el preu original i el preu actual i imprimeix el descompte (en %).

fun main(){

    //Definim l'objecte Scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    //Demanem que introdueixi el preu de 2 nombres.
    var preuOriginal : Double = scanner.nextDouble()
    var preuActual : Double = scanner.nextDouble()

    //Ara calculem el descompte amb una sencilla regla de 3.
    var descompte : Double = ((preuOriginal - preuActual) / preuOriginal) * 100

    //Mostrem el resultat per pantalla.
    println(descompte)
}