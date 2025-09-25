//Program : Doblant numeros
import java.util.*
// Enunciat : Escriu un programa que llegeixi un número per entrada i imprimeixi el doble del seu valor.
fun main() {
    //Definir l'objecte scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)
    //Demanem els numeros a doblar
    println("Numero :")
    var num : Int = scanner.nextInt()
    // Sumem el numero introduit i mostrem per pantalla el resultat
    var result : Int = num + num
    println("El resultat es : $result")
}