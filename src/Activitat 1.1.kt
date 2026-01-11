//Punt 1: - Exercicis de tipus de dades, transformacions i operacions.

//Program : Hello world!

import java.util.*

// Enunciat : Escriu un programa que imprimeixi per pantalla la frase “Hello World!”.

fun main() {

    //Definir l'objecte scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    //Demanem a l'usuari que escrigui un text.
    var text : String = scanner.nextLine()

    //Indepenentment del text imprimim Hello world.
    println("Hello World!")
}