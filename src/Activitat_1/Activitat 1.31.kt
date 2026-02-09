package Activitat_1

import java.util.Scanner

//Program : De metre a peu

//Enunciat : Fes un programa que calculi l'equivalent en peus una longitud en metres.
//Tingues en compte que:
//1 metre = 39,37 polzades
//12 polzades = 1 peu

fun main(){
    val scan  = Scanner(System.`in`)

    //Declarem les variables a utilitzar.
    var numeroMetres : Int = scan.nextInt()
    var metre : Int = 0
    var polzades : Double = 0.0
    var peu : Double = 0.0

    //Calculem segons el numero de metres, cuants peus tenim.
    for (i in 1..numeroMetres){
        metre++
        polzades += 39.37
        peu = polzades / 12
    }

    //Imprimim el resultat per pantalla
    println(peu)
}