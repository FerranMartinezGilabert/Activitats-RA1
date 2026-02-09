package Activitat_1//Program : Suma, multiplicació i modul de enters.

import java.util.*

//Enunciat : L'usuari escriu 4 enters i s'imprimeix el valor de sumar el primer amb el segon, multiplicat
// per el mòdul del tercer amb el quart.

fun main() {

    //Definir l'objecte scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    //Demanem a l'usuari que ens doni 4 numeros
    var num : Int = scanner.nextInt()
    var num2 : Int = scanner.nextInt()
    var num3 : Int = scanner.nextInt()
    var num4 : Int = scanner.nextInt()

    //Fem l'operació i la guardem a resultat.
    var resultat : Int = (num + num2) * (num3 % num4)

    //Imprimim el resultat per pantalla.
    println(resultat)
}