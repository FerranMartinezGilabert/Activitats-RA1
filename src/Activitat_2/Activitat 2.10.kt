package Activitat_2

import java.util.Scanner

//Program : Calcula la lletra del dni.

//Fes un programa que donat un numero de dni et calculi la lletra que li correspon.

fun main(){
    val scanner = Scanner(System.`in`)

    val NUMERODNI : Int = scanner.nextInt()

    val LETRASDNI : Array<Char> = arrayOf('T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
        'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E')

    var calculLletraDni : Int = NUMERODNI % 23

    println("$NUMERODNI${LETRASDNI.get(calculLletraDni)}")
}

