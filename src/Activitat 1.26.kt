import java.util.Scanner

//Program: Fes-me minúscula.

//Enunciat : Fes un programa que rep un caràcter de l'abecedari en majúscula i el faci minúscula.

fun main(){
    val scan : Scanner = Scanner(System.`in`)

    //Declarem les variables
    val lletraAlfabet : Char = scan.nextLine().first()

    //La fem mayuscula
    val lletra : Char = lletraAlfabet.lowercaseChar()

    //L'imprimim per pantalla
    println(lletra)
}