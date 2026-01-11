//Program : Celcius a Farenheit

import java.util.*
//Enunciat : Feu un programa que rebi una temperatura en graus Celsius i la converteixi en graus Fahrenheit

fun main(){
    //Definim l'objecte Scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    //Demanem la temperatura en graus Celcius.
    var celcius : Double = scanner.nextDouble()

    //Ara transformem la temperatura a graus Farenheit.
    var farenheit : Double = ((celcius * 9) / 5) + 32

    //Mostrem el resultat per pantalla.
    println(farenheit)
}