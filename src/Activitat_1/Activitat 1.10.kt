package Activitat_1//Program : Diametre y superficie d''una pizza

import java.util.*

//Enunciat : Llegeix el diàmetre d'una pizza rodona i imprimeix la seva superfície.
// Pots usar Math.PI per escriure el valor de Pi.

fun main(){

    //Definim l'objecte Scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    //Demanem el diametre
    println("El diametre de la pizza es :")
    var diametre : Double = scanner.nextDouble()

    //Ara calculem el radi de la pizza
    var radi : Double = (diametre / 2)

    //I per acabar fem la superficie de la pizza a partir del radi
    var superficie : Double = Math.PI * (radi * radi)

    //Mostrem el resultat per pantalla
    println(superficie)
}