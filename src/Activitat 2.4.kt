import java.util.Scanner

//Program : Té edat per treballar.

//Enunciat : Escriu un programa que llegeixi l'edat de l'usuari i mostri si té edat per treballar, l'edat mínima per
// treballar legalment és 16 i suposadament l'edat màxima als 65.

fun main(){
    val scanner = Scanner(System.`in`)

    //Declarem les variables.
    val EDAT : Int = scanner.nextInt()
    val EDAT_MINIMA : Int = 16
    val EDAT_MAXIMA : Int = 65

    //Comprobem si té edat per treballar e imprimim el resultat per pantalla.
    if (EDAT in EDAT_MINIMA..EDAT_MAXIMA) {
        println("Té edat per treballar")
    }else println("No té edat per treballar")
}