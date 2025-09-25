//Program : area calculator
import java.util.*
//Enunciat : Una web d'habitatges de lloguer ens ha proposat una ampliació.
// Volen mostrar l'àrea de les habitacions per llogar.
// Fes un programa que ens ajudi a calcular les dimensions d'una habitació.
// Llegeix l'amplada i la llargada en metres (enters) i mostra'n l'àrea.
fun main() {
    //Definir l'objecte scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)
    //Declarem amplada i llargada
    println("Amplada :")
    var amplada : Int = scanner.nextInt()
    println("Llargada :")
    var llargada : Int = scanner.nextInt()
    // Calculem l'area del objecte i ho mostrem a pantalla
    var area : Int = amplada * llargada
    println("L'area del objecte es : $area")
}