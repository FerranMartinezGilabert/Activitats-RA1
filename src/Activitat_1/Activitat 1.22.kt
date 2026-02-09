package Activitat_1

import java.util.Scanner

//Program: Qui riu ultim riu millor

//Enunciat : Fes un programa que rebi el valor del nivell de riure de 5 persones i comprovi si la dita és certa.

fun main(){
    val scan : Scanner = Scanner(System.`in`)

    //Declarem les variables.
        var comprobant : Boolean = false
        var persones : Array<Int> = Array(5){0}
        var ultimaPersona : Int = persones.lastIndex

        //Omplim l'array de numeros.
        for (persona in 0 until persones.size){
            persones[persona]=scan.nextInt()

            //Llegim la llista mirant que el últim valor sigui mes gran que tots els anteriors.
            if (persones[persona] > ultimaPersona){
                comprobant = true
            } else comprobant = false
        }

        //Llegim la llista mirant que el últim valor sigui mes gran que tots els anteriors.
        /*for (persona in 0 until persones.size){
            if (persones[persona] > ultimaPersona){
                comprobant = true
            } else comprobant = false
        }
        Es mes optim fer 2 bucles separats(?)
         */

        //Imprimim el resultat per pantalla.
        println(comprobant)
}