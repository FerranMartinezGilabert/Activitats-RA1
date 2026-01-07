import java.util.Scanner

//Program: Es un nombre?

fun main(){
    val scan : Scanner = Scanner(System.`in`)

    //Declarem variables
    val CARACTER = scan.nextLine().first()

    //Comprobem si es un numero del 0-9 amb isDigit, en comptes de fer un Array de 10 numeros del 0-9 i
    // si es un Char torna false
    val COMPROBANT : Boolean = CARACTER.isDigit()

    //Imprimim el resultat per pantalla
    print(COMPROBANT)
}