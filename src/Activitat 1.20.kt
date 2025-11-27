//Program: Nombres decimals iguals.
import java.util.Scanner

fun main(){
    val scan : Scanner = Scanner(System.`in`)

    //Declarem les variables a utilitzar.
    var numero1 : Float = scan.nextFloat()
    var numero2 : Float = scan.nextFloat()
    var comprobant : Boolean = false

    //Comprobem que siguin iguals.
    if (numero1 == numero2){
        comprobant = true

    //Imprimim el resultat per pantalla.
    println(comprobant)
    }
    println(comprobant)
}