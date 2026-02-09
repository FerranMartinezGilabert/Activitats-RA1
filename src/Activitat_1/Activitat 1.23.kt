package Activitat_1

import java.util.Scanner

//Program: Es una letra?

//Enunciat : Fes un programa que rebi un caràcter i digui si és una lletra o no.

fun main(){
    val scan : Scanner = Scanner(System.`in`)

    //Declarem les variables, fem una llista amb l'alfabet, en aquest cas fiquem ç i ñ per
    // tindre els dos alfabets castellà i català.
    val ALFABET : Array<Char> = arrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
        'L', 'M','N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Ç', 'Ñ')
    var comprobant = false
    var lletraAComprobar : Char = scan.nextLine().first() //Afegim .first per agafar el primer caràcter.

    //Comprobem si la letra es a la llista.
    for (lletra in 0 until ALFABET.size) {

        //Ho transformem a majúscules tot perque així no tenim que fer 2 llistes en majúscules i minúscules,
        // comprobem que sigui una lletra.
        if (lletraAComprobar.uppercaseChar() == ALFABET[lletra]){
            comprobant = true
        }
    }

    //Imprimim el resultat per pantalla.
    println(comprobant)
}