//Program : Suma, multiplicació i modul de enters
import java.util.*
//Enunciat : L'usuari escriu 4 enters i s'imprimeix el valor de sumar el primer amb el segon, multiplicat
// per el mòdul del tercer amb el quart.
fun main() {
    //Definir l'objecte scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)
    //Demanem a l'usuari que ens doni 4 numeros
    println("Numero 1 :")
    var num : Int = scanner.nextInt()
    println("Numero 2 :")
    var num2 : Int = scanner.nextInt()
    println("Numero 3 :")
    var num3 : Int = scanner.nextInt()
    println("Numero 4 :")
    var num4 : Int = scanner.nextInt()
    // Sumem els numeros 1 i 2 i els multipliquem per el modul del 3 amb el 4 i mostrem el resultat per pantalla
    var resultat : Int = (num + num2) * (num3 % num4)
    println("El resultat de l'operació es: $resultat")
}