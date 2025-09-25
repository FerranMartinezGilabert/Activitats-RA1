//Program : Show decimal number & get the double
import java.util.*

fun main() {
    //Definir l'objecte scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)
//Demanem el nombre decimal i calculem el doble
    println("Introdueix un nombre decimal :")
    var nombreDecimal : Double = scanner.nextDouble()
    var elDobleDelNombre : Double = nombreDecimal + nombreDecimal
//Mostrem el resultat a pantalla
    println("El doble del nombre decimal es : $elDobleDelNombre")
}