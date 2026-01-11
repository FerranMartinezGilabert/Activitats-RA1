import java.util.Scanner

//Program : És divisible

fun main (){
    val scan  = Scanner(System.`in`)

    //Declarem les variables.
    var divisor : Int = scan.nextInt()
    var numeroADividir : Int = scan.nextInt()
    var comprobant : Boolean = false

    //Comprobem si el numero es divisible.
    if (numeroADividir % divisor == 0){
        comprobant = true
    }

    //Imprimim el resultat per pantalla.
    println(comprobant)
}