//Program : Divisor de compte

import java.util.*
//Enunciat : Fes un programa on, introduit el número de començals i el preu d'un sopar (que pot contenir cèntims),
//imprimeixi quan haurà de pagar cada començal.

fun main(){

    //Definim l'objecte Scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    //Demanem el numero de començals.
    println("Quants comenals sou?")
    var comensals : Int = scanner.nextInt()

    //Ara demanem a l'usuari que fiqui el preu del sopar.
    println("Quin ha sigut el cost total del sopar?")
    var preuSopar : Double = scanner.nextDouble()

    //Ara calculem el preu per persona.
    var preuSoparPerPersona : Double = preuSopar / comensals

    //Mostrem el resultat per pantalla.
    println("El preu per persona es : $preuSoparPerPersona€")
}