import java.util.Scanner

//Program: Es un nombre?

//Enunciat: Fes un programa que rebi un caràcter i digui si és un nombre o no.

fun main(){
    val scan : Scanner = Scanner(System.`in`)

    //Demanem un caràcter.
    val CARACTER = scan.nextLine().first()

    //Comprobem si es un numero del 0-9 amb isDigit, si es un caràcter torna false.
    val COMPROBANT : Boolean = CARACTER.isDigit()

    //Per què del 0-9 amb isDigit i no fer un array amb 10 numeros del 0-9 i comprobar? Doncs perquè amb .first
    // agafem el primer char del String que escribim amb nextLine, es a dir, el transformem un String en Char, llavors
    // amb isDigit el transformem a numero. I amb un numero a programació només tenim 10 opcions del 0 al 9.

    //Imprimim el resultat per pantalla
    print(COMPROBANT)
}