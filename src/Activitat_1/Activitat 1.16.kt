package Activitat_1//Program: Transforma l'enter

//Enunciat: Fes un programa que afegeixi donat un nombre enter, imprimeixi el mateix número en decimal.
import java.util.Scanner

fun main(){
    val scan : Scanner = Scanner(System.`in`)

    //Demanem la variable.
    var numeroEnter : Int = scan.nextInt()

    //Imprimim el resultat per pantalla.
    println(numeroEnter.toFloat())
}