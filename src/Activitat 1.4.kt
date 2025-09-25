//Program : area calculator
import java.util.*

fun main() {
    //Definir l'objecte scanner
    val scanner: Scanner = Scanner(System.`in`).useLocale(Locale.UK)
    //Declarem amplada i llargada
    println("Amplada :")
    var amplada : Int = scanner.nextInt()
    println("Llargada :")
    var llargada : Int = scanner.nextInt()
    // Calculem l'area del objecte i ho mostrem a pantalla
    var area : Int = amplada * llargada
    println("L'area del objecte es : $area")
}