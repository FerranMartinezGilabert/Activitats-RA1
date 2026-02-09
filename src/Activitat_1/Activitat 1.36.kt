package Activitat_1

import java.util.Scanner
import kotlin.text.iterator

//Program : Construeix la història

//Enunciat : Escriu un programa que llegeixi 3 frases diferents per terminal i en faci 1 història.

fun main() {
    val scan: Scanner = Scanner(System.`in`)

    // Declarem les variables.
    var llistaFrases: Array<String> = Array(3) { "" }
    var fraseCompleta: String = ""
    var resultat: String = ""

    // Contruïm la frase amb un bucle for que vagi llegint frases que fica l'usuari.
    for (i in 0 until llistaFrases.size) {
        llistaFrases[i] = scan.nextLine()
    }

    // Guardem les 3 frases a un String i la separem amb espais.
    for (i in 0 until llistaFrases.size) {
        fraseCompleta += llistaFrases[i]
        if (i < llistaFrases.size - 1) {
            fraseCompleta += " "
        }
    }

    // Mirem que tingui caràcters especials d'operacions i en cas de tindre ho substituïm a una nova variable
    // anomenada resultat.
    for (caracter in fraseCompleta) {
        when (caracter) {
            '%' -> resultat += "mòdul"
            '-' -> resultat += "diferència"
            '+' -> resultat += "suma"
            '*' -> resultat += "factorització"
            '/' -> resultat += "divisió"
            else -> resultat += caracter //Sinò hi ha cap caracter especial, el deixem com estaba.
        }
    }

    // Imprimim el resultat a pantalla.
    println(resultat)
}