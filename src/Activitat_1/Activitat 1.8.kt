package Activitat_1//Program : Show decimal number & get the double.

import java.util.*

//Enunciat : Llegeix un valor amb decimals i imprimeix el doble.

fun main() {

    //Definir l'objecte scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    //Demanem el nombre decimal.
    var nombreDecimal : Double = scanner.nextDouble()

    //Calculem el doble.
    var elDobleDelNombre : Double = nombreDecimal + nombreDecimal

    //Mostrem el resultat a pantalla
    println(elDobleDelNombre)
}