package Activitat_1

import java.util.Scanner

//Program: Fes-me mayuscula

//Enunciat : Fes un programa que rep un caràcter de l'abecedari en minúscula i el faci mayúscula.

fun main(){
    val scan : Scanner = Scanner(System.`in`)

    //Declarem les variables
    val lletraAlfabet : Char = scan.nextLine().first()

    //La fem mayuscula
    val lletra : Char = lletraAlfabet.uppercaseChar()

    //L'imprimim per pantalla
    println(lletra)
}