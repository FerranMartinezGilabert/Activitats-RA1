//Program: Calculadora de volum d'aire
import java.util.*
//Enunciat: Per poder fer un estudi de la ventilació d'una aula necessitem poder calcular la quantitat d'aire que hi cap en una habitació.
//Llegeix les 3 dimensions de l'aula i imprimeix per pantalla quin volum té.
fun main(){
    //Definim l'objecte Scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)
    //Demanem les 3 dimensions
    println("Llargada :")
    var llargada : Double = scanner.nextDouble()
    println("Amplada :")
    var amplada : Double = scanner.nextDouble()
    println("Alzada :")
    var alzada : Double = scanner.nextDouble()
    //Ara calculem el volum de l'habitació
    var volum : Double = llargada * alzada * amplada
    //Mostrem el resultat per pantalla
    println("El volum de l'habitacio es : $volum metres cubics")
}