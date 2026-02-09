package Activitat_1//Program : + 1 segon!

import java.util.*

//Enunciat : Fes un programa que afegeixi 1 segon un nombre de segons determinat.

fun main(){

    //Definim l'objecte Scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    //Demanem els segons a l'usuari.
    println("Indiqui un numero en segons :")
    var segons : Int = scanner.nextInt()

    //Declarem la variable temps a 0.
    var temps : Int = 0

    //Si el segon afegit no arriba a 60 sumem 1 al temps, sinó el temps son 0 segons.
    if (segons + 1 > 60){
        temps += segons + 1
        //Imprimim el resultat.
        println(temps)
    }else println(temps)
}
