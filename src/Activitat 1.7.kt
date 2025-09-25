//Program : show number
import java.util.*

fun main() {
    //Definir l'objecte scanner
    val scanner: Scanner = Scanner(System.`in`).useLocale(Locale.UK)
    //Demanem el nombre enter i fem una operacio per mostrar el resultat
    var nombreEnter: Int = scanner.nextInt()
    var nombreFinal: Int = nombreEnter + 1
    //El mostrem en pantalla
    println("Després ve el $nombreFinal")
}