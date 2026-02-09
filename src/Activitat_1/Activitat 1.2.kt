package Activitat_1//Program : Doblant numeros

import java.util.*

// Enunciat : Escriu un programa que llegeixi un número per entrada i imprimeixi el doble del seu valor.

fun main() {

    //Definir l'objecte scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    //Demanem un numero.
    var num : Int = scanner.nextInt()

    // El sumem per si mateix, així obtenim el doble.
    var result : Int = num + num

    // Imprimim el resultat per pantalla.
    println(result)
}