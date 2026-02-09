package Activitat_1

import java.util.Scanner

//Program : Creador de targetes de treball.

//Enunciat : Escriu un programa que imprimeixi targetes de treball. Aquestes han de contenir, nom, cognom i
// número de despatx de la persona treballadora.

fun main (){
    val scan  = Scanner(System.`in`)

    //Declarem les variables.
    var nom : String = scan.nextLine()
    var cognom : String = scan.nextLine()
    var despatx : Int = scan.nextInt()

    //Imprimim les credencials del usuari per pantalla.
    println("Empleada: $nom $cognom - Despatx: $despatx")

}