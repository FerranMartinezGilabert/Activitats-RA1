package Activitat_1

import java.util.Scanner

//Program : Hola Usuari

//Enunciat : Escriu un programa que llegeixi un nom d’usuari per l’entrada i imprimeixi una frase de benvinguda.

fun main (){
    val scan  = Scanner(System.`in`)

    //Declarem la variable.
    val USUARI : String = scan.nextLine()

    //Saludem al usuari.
    println("Bon dia "+ USUARI)

}