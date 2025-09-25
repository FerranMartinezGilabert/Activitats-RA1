//Program : suma de 2 numeros
import java.util.*
// Enunciat : Escriu un programa que donat dos números retorni la suma d’aquests.
fun main() {
    //Definir l'objecte scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)
    //Demanem els numeros a sumar
    println("Numero 1 :")
    var num : Int = scanner.nextInt()
    println("Numero 2 :")
    var num2 : Int = scanner.nextInt()
    // Sumem els numeros introduits i mostrem per pantalla el resultat
    var result : Int = num + num2
    println("El resultat es : $result")
}