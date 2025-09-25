//Program : Hello world!
import java.util.*
// Enunciat : Escriu un programa que imprimeixi per pantalla la frase “Hello World!”.
fun main() {
    //Definir l'objecte scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)
    //Demanem a l'usuari que escrigui un text!
    var text : String = scanner.nextLine()
    //Mostrem el missatge final!
    println("Hello World!")
}