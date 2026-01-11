//Program : Quina temperatura fa?

import java.util.*

//Enunciat : Escriu un programa que llegeixi un una temperatura i un augment d’aquest, el programa
// ha d’imprimir per pantalla quina és la temperatura amb l’augment aplicat.

fun main(){
    //Definim l'objecte Scanner.
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    //Demanem la temperatura i per cuant la volem augmentar..
    var temperatura : Double = scanner.nextDouble()
    var augmentTemperatura : Double = scanner.nextDouble()

    //Sumem la temperatura.
    var temperaturaNova : Double = temperatura + augmentTemperatura

    //Mostrem el resultat per pantalla.
    println("La temperatura actual es : $temperaturaNova º")
}