//Descompte en %
import java.util.*

fun main(){
    //Definim l'objecte Scanner
    val scanner: Scanner = Scanner(System.`in`).useLocale(Locale.UK)
    //Demanem que introdueixi el preu de 2 nombres
    println("El preu original del producte es :")
    var preuOriginal : Double = scanner.nextDouble()
    println("El preu actual descomptat es :")
    var preuActual : Double = scanner.nextDouble()
    //Ara calculem el descompte amb una sencilla regla de 3
    var descompte : Double = (preuOriginal - preuActual) / 10
    //Mostrem el resultat per pantalla
    println("El descompte de preu es : $descompte %")
}