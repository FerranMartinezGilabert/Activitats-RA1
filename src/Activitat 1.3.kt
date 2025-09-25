import java.util.*

fun main() {
    //Definir l'objecte scanner
    val scanner: Scanner = Scanner(System.`in`).useLocale(Locale.UK)
    //Definim els numeros a introduir
    val num = scanner.nextInt()
    val num2 = scanner.nextInt()
    // Sumem els numeros introduits
    println(num + num2)
}