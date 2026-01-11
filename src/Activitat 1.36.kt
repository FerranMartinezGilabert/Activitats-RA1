import java.util.Scanner

//Program : Construeix la història

fun main() {
    val scan: Scanner = Scanner(System.`in`)

    // Declarem les variables.
    var llistaFrases: Array<String> = Array(3) { "" }
    var fraseCompleta: String = ""
    var resultat: String = ""

    // Contruïm la frase.
    for (i in 0 until llistaFrases.size) {
        llistaFrases[i] = scan.nextLine()
    }

    // La guardem a un String i fiquem els espais.
    for (i in 0 until llistaFrases.size) {
        fraseCompleta += llistaFrases[i]
        if (i < llistaFrases.size - 1) {
            fraseCompleta += " "
        }
    }

    // Mirem que tingui caràcters especials i en cas de tindre els substituïm a una nova variable resultat.
    for (caracter in fraseCompleta) {
        when (caracter) {
            '%' -> resultat += "mòdul"
            '-' -> resultat += "diferència"
            '+' -> resultat += "suma"
            '*' -> resultat += "factorització"
            '/' -> resultat += "divisió"
            else -> resultat += caracter
        }
    }

    // Imprimim el resultat a pantalla.
    println(resultat)
}